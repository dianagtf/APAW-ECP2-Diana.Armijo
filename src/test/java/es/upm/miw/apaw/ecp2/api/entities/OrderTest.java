package es.upm.miw.apaw.ecp2.api.entities;

import java.math.BigDecimal;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OrderTest {
	
	Order order;
	int id;
	BigDecimal bigDecimal;
	Calendar date;
	

	@Before
    public void before() {
		
		bigDecimal = new BigDecimal(1000);
		id = 1;
		date = Calendar.getInstance();
		
		order = new Order(bigDecimal);
		order.setId(id);
		order.setAmount(bigDecimal);
		order.setDate(date);
	}
	
	@Test
	public void testGetId() {
		assertEquals(id, order.getId());
	}
	
	@Test
	public void testGetDate() {
		assertEquals(date, order.getDate());
	}
	
	@Test
	public void testGetAmount() {
		assertEquals(bigDecimal, order.getAmount());
	}
}
