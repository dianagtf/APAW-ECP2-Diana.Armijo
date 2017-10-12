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
		orderController.createOrder(amount);
    }
	
	@Test
    public void testCreateOrder() {
		BigDecimal amount2 = new BigDecimal(20);
		
		orderController.createOrder(amount2);
		assertEquals(2, OrderController.orderList().size());
		assertEquals(amount2, OrderController.orderList().get(1).getAmount());
    }
}
