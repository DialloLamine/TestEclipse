package com.diallo.App3tierGit.metier;

import java.util.List;
import java.util.Set;

import com.diallo.App3tier.entitiesGit.Agent;
import com.diallo.App3tier.entitiesGit.MeteoData;
import com.diallo.App3tierGit.dao.DaoJSONFile;
import com.diallo.App3tierGit.dao.IDao;

/**
 * @author Diallo 
 * 
 * Cette Classe inplemente l'interface IMetier
 *et en meme temps instancie l'interface IDao
 */
public class Metier implements IMetier {
	private IDao dao = new DaoJSONFile("data\\meteo.json");

	
	/**
	 * Constructeur sans param
	 */
	public Metier() {
	}
	
	/**
	 * @param dao
	 * recois en param un obj de type Dao
	 * instancie l'objet courant a ce dernier
	 */
	public Metier(IDao dao) {
		super();
		this.dao = dao;
	}

	/**
	 * @return l'objet dao
	 */
	public IDao getDao() {
		return dao;
	}

	/**
	 * @param dao
	 * acces et modifie l'objet dao
	 */
	public void setDao(IDao dao) {
		this.dao = dao;
	}

	
	/**
	 *Passage des méthodes d'accès aux données
	 */
	@Override
	public Set<Agent> getAllData() {
		return dao.getAllData();
	}
	
	/**
	 *@param agents
	 *renvois les donnees d'un agent
	 */
	@Override
	public List<MeteoData> getMeteoDataFromAgent(Set<Agent> agents, Agent agent) {
		return dao.getMeteoDataFromAgent(agents, agent);
	}

	//Méthodes business
	
	/**
	 *@param date
	 *Calcul  moyene releve d'une donnee  de la meteo passee en @param
	 *Et renvois cette derniere
	 */
	@Override
	public double computeAverage(List<MeteoData> data) {
		double total = 0;
		
		for(MeteoData d : data) {
			total += d.getDegre();
		}
		
		return total/data.size();
	}

	/**
	 *@param agent
	 *renvois la moyene releve par un agent passe en param
	 */
	@Override
	public double computeAverageByAgent(Agent agent) {
		return computeAverage(agent.getListe());
	}

}
