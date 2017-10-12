package es.upm.miw.apaw.ecp2.api;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.apaw.ecp2.api.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.api.daos.memory.DaoMemoryFactory;
import es.upm.miw.apaw.ecp2.api.entities.Professional;
import es.upm.miw.apaw.ecp2.api.resources.OrderResource;
import es.upm.miw.apaw.ecp2.api.resources.ProfessionalResource;
import es.upm.miw.apaw.ecp2.http.HttpClientService;
import es.upm.miw.apaw.ecp2.http.HttpMethod;
import es.upm.miw.apaw.ecp2.http.HttpRequest;
import es.upm.miw.apaw.ecp2.http.HttpRequestBuilder;
import es.upm.miw.apaw.ecp2.http.HttpException;

public class ProfessionalResourceFunctionalTesting {

	private void createOrder() {

		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(OrderResource.ORDERS).body("10")
				.build();
		new HttpClientService().httpRequest(request);
	}

	private void createProfessional() {
		this.createOrder();
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(ProfessionalResource.PROFESSIONALS)
				.body("1").build();
		new HttpClientService().httpRequest(request);
	}

	@Before
	public void before() {
		DaoFactory.setFactory(new DaoMemoryFactory());
	}

	@Test(expected = HttpException.class)
	public void testCreateProfessionalEmpty() {
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(OrderResource.ORDERS).body("")
				.build();
		new HttpClientService().httpRequest(request);
	}

	@Test
	public void testCreateProfessional() {
		this.createProfessional();
	}

	@Test
	public void testSeeProfessional() {
		this.createProfessional();
		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.GET).path(ProfessionalResource.PROFESSIONALS)
				.path(ProfessionalResource.PHONES).expandPath("1").build();
		assertEquals("{\"id\":1,\"phones\":\"555555555\"}", new HttpClientService().httpRequest(request).getBody());
	}

	@Test
	public void testSeeLevelProfessional() {
		long phone2 = 55555555;

		DaoFactory.getFactory().getProfessionalDao().create(new Professional(phone2));

		HttpRequest request = new HttpRequestBuilder().method(HttpMethod.GET).path(ProfessionalResource.PROFESSIONALS)
				.path(ProfessionalResource.PHONES).path(ProfessionalResource.LEVEL).body("1:55555555:NORMAL").build();

		assertEquals("[{1:55555555:NORMAL}]", new HttpClientService().httpRequest(request).getBody());

	}

}
