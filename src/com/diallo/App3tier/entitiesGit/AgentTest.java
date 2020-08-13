package com.diallo.App3tier.entitiesGit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AgentTest {

	private Agent fred;
	private List<Agent> list;

	@Before
	public void setUp() throws Exception {
		fred =  new Agent("Fred","Anvers");
	}

	@Test
	public void testToString() {
		
		String name = "Diallo";
		String town = "BXL";
		
		String model = "nom = " + name + "ville = " + town + " "+ list;
		
		assertNotEquals(model, fred.toString());
		
		assertNotNull(fred);
	}

}
