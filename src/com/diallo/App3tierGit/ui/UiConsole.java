package com.diallo.App3tierGit.ui;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;

import com.diallo.App3tier.entitiesGit.Agent;
import com.diallo.App3tier.entitiesGit.MeteoData;
import com.diallo.App3tierGit.metier.IMetier;
import com.diallo.App3tierGit.metier.Metier;

public class UiConsole implements IUi {
	private IMetier metier;
	
	public UiConsole() {
		this.metier = new Metier();
	}
	
	public UiConsole(IMetier metier) {
		this.metier = metier;
	}

	public IMetier getMetier() {
		return metier;
	}

	public void setMetier(IMetier metier) {
		this.metier = metier;
	}

	@Override
	public void run() {
		//Lecture des données
		Set<Agent> agents = metier.getAllData();	//En réalité, c'est dao qui le fera
		
		//Traitement des données: recherche spécifique
		Agent agent = new Agent("Bob", "Bruxelles");
		List<MeteoData> dataBob = metier.getMeteoDataFromAgent(agents, agent);
		
		//Traitement des données: calcul spécifique		
		double moyenne = metier.computeAverage(dataBob);
		
		//Affichage du résultat
		System.out.println("La moyenne des relevés de "
				+ agent.getNom() + " est de "
				+ (new DecimalFormat("#.00")).format(moyenne) +".");
		
		//
		
		//Traitement des données: recherche spécifique
		agent = new Agent("Fred", "");
		
		//Traitement des données: calcul spécifique		
		moyenne = metier.computeAverage(metier.getMeteoDataFromAgent(agents, agent));
		
		//Affichage du résultat
		System.out.println("La moyenne des relevés de "
				+ agent.getNom() + " est de "
				+ (new DecimalFormat("#.00")).format(moyenne) +".");

	}

}
