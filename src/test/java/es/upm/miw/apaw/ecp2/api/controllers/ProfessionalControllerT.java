package es.upm.miw.apaw.ecp2.api.controllers;


import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

import es.upm.miw.apaw.ecp2.api.daos.DaoFactory;
import es.upm.miw.apaw.ecp2.api.daos.memory.DaoMemoryFactory;
import es.upm.miw.apaw.ecp2.api.entities.Professional;

public class ProfessionalControllerT {
	
	@Before
    public void before() {
		long phone = 11111111;
		
		DaoFactory.setFactory(new DaoMemoryFactory());
		
		DaoFactory.getFactory().getProfessionalDao().create(new Professional(phone));

    }
	
	@Test
    public void testSeeProfessional() {
		long phone2 = 55555555;
		
		DaoFactory.getFactory().getProfessionalDao().create(new Professional(phone2));
		assertEquals(2, DaoFactory.getFactory().getProfessionalDao().findAll().size());
		assertEquals(phone2, DaoFactory.getFactory().getProfessionalDao().findAll().get(1).getPhone());

    }

	@Test
    public void testSeeProfessionalLevel() {
		long phone2 = 55555555;

		DaoFactory.getFactory().getProfessionalDao().create(new Professional(phone2));
		DaoFactory.getFactory().getProfessionalDao().findAll().get(1).setLevel("NORMAL");
		assertEquals(2, DaoFactory.getFactory().getProfessionalDao().findAll().size());
		assertEquals("NORMAL", DaoFactory.getFactory().getProfessionalDao().findAll().get(1).getLevel());

    }
	
}
