package poo;

import java.io.BufferedWriter;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.boot.CommandLineRunner;

import com.diallo.App3tier.entitiesGit.Agent;
import com.diallo.App3tier.entitiesGit.MeteoData;
import com.diallo.App3tierGit.ui.IUi;
import com.diallo.App3tierGit.ui.UiConsole;
import com.example.demo.DemoApplication;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

public class Application implements CommandLineRunner {
	private static IUi ui;

	
	  public static void main(String[] args) {
		  
	ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
	
		  IUi uiConsole = new UiConsole();
		  
		  uiConsole.run();
	  
	  }  
	  
	  @Override 
	  public void run(String... args) throws Exception { // TODO
	
	  
	  }
	  


}
