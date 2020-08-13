package com.diallo.App3tierGit.metier;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;

import org.junit.Test;

import com.diallo.App3tier.entitiesGit.MeteoData;
import com.diallo.App3tierGit.dao.DaoJSONFile;

public class MetierTest {
	
	private List<MeteoData> data;
	private Metier metier;
	
	@Before
	public void setUp() throws Exception {
		
		data = new ArrayList<MeteoData>();
		 metier = new Metier(new DaoJSONFile("data\\meteo.json"));
	}

	@Test
	public void testComputeAverage() {
		
		//preparation
		data = Arrays.asList(
				new MeteoData(LocalDate.parse("2020-04-01"), 7),
				new MeteoData(LocalDate.parse("2020-04-02"), 10),
				 new MeteoData(LocalDate.parse("2020-04-03"), 10)
				);
		
		//utilisation
		double moyenne = (metier.computeAverage(data)) / 3;
		
		//verification
		assertEquals(3.0, moyenne, 0.0);
	}

}











