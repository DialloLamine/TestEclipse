package com.diallo.App3tierGit.dao;

import java.util.List;
import java.util.Set;

import com.diallo.App3tier.entitiesGit.Agent;
import com.diallo.App3tier.entitiesGit.MeteoData;

public interface IDao {
	/**
	 * Renvoie tous les relevés groupés par Agent
	 * 
	 * @return
	 */
	public Set<Agent> getAllData();
	public List<MeteoData> savaAllData();
	public List<MeteoData> getMeteoDataFromAgent(Set<Agent> agents, Agent agent);	
}
