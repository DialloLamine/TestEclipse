package com.diallo.App3tierGit.dao;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.diallo.App3tier.entitiesGit.Agent;

public class DaoJSONFileTest {
	
	private List<Agent> agents;
	private IDao dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		agents = null;
		dao = new DaoJSONFile("data\\meteo.json");
	}

	@Test
	public void testSavaAllData() {
		
		//preparation
		agents = Arrays.asList(
				new Agent("Diallo", "BXL"),
				new Agent("Rama", "Anvers"),
				new Agent("Bod", "PRS")
				);
		dao.savaAllData();
		
		
	}

}
