package es.upm.miw.apaw.ecp2.api;


import org.junit.Before;
import org.junit.Test;

import es.upm.miw.apaw.ecp2.api.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.api.daos.memory.DaoMemoryFactory;
import es.upm.miw.apaw.ecp2.api.resources.OrderResource;
import es.upm.miw.apaw.ecp2.http.HttpClientService;
import es.upm.miw.apaw.ecp2.http.HttpMethod;
import es.upm.miw.apaw.ecp2.http.HttpRequest;
import es.upm.miw.apaw.ecp2.http.HttpRequestBuilder;

public class OrderResourceFuncionalTesting {

	@Before
    public void before() {
        DaoFactory.setFactory(new DaoMemoryFactory());
    }
	
	private void createOrder() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(OrderResource.ORDERS).body("10").build();
        new HttpClientService().httpRequest(request);
    }
	
	@Test
    public void testcreateOrder() {
        this.createOrder();
    }
}
