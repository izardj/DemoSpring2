package com.gtm.DemoSpring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scene {

	public static void main(String[] args) {
		// 1- Chargement du conteneur et creation des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spectacle.xml");
		
		// 2- recuperation d'un bean
		Performeur olivier = (Performeur) appContext.getBean("Olivier");
		Performeur caroline = (Performeur) appContext.getBean("Caroline");
		Performeur jeanMarc = (Performeur) appContext.getBean("Jean-Marc");
		Performeur julien = (Performeur) appContext.getBean("Julien");
		Performeur alain = (Performeur) appContext.getBean("Alain");
		
		// 3- Traitement
		System.out.println("--------- OLIVIER -----------");
		olivier.performe();
		System.out.println("--------- CAROLINE ----------");
		caroline.performe();
		System.out.println("--------- JEAN-MARC ----------");
		jeanMarc.performe();
		System.out.println("--------- JULIEN ----------");
		julien.performe();
		System.out.println("--------- ALAIN ----------");
		alain.performe();
		appContext.close();
	}

}
