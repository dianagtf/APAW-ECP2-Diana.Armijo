package es.upm.miw.apaw.ecp2.api.controllers;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.apaw.ecp2.api.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.api.daos.memory.DaoMemoryFactory;
import es.upm.miw.apaw.ecp2.api.entities.Order;

public class OrderControllerT {
	private OrderController orderController;
	
	@Before
    public void before() {
		DaoFactory.setFactory(new DaoMemoryFactory());
		BigDecimal amount = new BigDecimal(10);
		
		orderController = new OrderController();
		DaoFactory.getFactory().getOrderDao().create(new Order(amount));
    }
	
	@Test
    public void testCreateOrder() {
		BigDecimal amount2 = new BigDecimal(20);
		
		DaoFactory.getFactory().getOrderDao().create(new Order(amount2));
		assertEquals(2, DaoFactory.getFactory().getOrderDao().findAll().size());
		assertEquals(amount2, DaoFactory.getFactory().getOrderDao().read(2).getAmount());
    }
}
