package com.diallo.App3tierGit.metier;

import java.util.List;
import java.util.Set;

import com.diallo.App3tier.entitiesGit.Agent;
import com.diallo.App3tier.entitiesGit.MeteoData;

public interface IMetier {
	//M�thodes d'acc�s aux donn�es de dao
	public Set<Agent> getAllData();
	public List<MeteoData> getMeteoDataFromAgent(Set<Agent> agents, Agent agent);
	
	//M�thode business
	public double computeAverage(List<MeteoData> data);
	public double computeAverageByAgent(Agent agent);
}
