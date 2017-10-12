package es.upm.miw.apaw.ecp2.api.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LevelTest {
	
	public String levelTest;
	
	public Level level = Level.NORMAL;
	
	@Before
	public void before() {
		levelTest =level.toString();
	}
	
	@Test
	public void testGetLevel() {
		assertEquals(level.toString(), level.getLevel());
	}

}
