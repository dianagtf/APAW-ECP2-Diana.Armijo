package es.upm.miw.apaw.ecp2.api.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProfessionalTest {

	Professional professional;
	long phone;
	long city;
	String type;
	
	@Before
    public void before() {
		
		phone = (long) 11111111;
		
		professional = new Professional(phone);
		professional.setPhone(phone);
		professional.setCity(city);
		professional.setType(type);
	}
	
	@Test
	public void testGetPhone() {
        assertEquals(phone, professional.getPhone());
    }
	
	@Test
	public void testGetCity() {
		assertEquals(city, professional.getCity());
	}
	
	@Test
	public void testGetType() {
		assertEquals(type, professional.getType());
	}
}
