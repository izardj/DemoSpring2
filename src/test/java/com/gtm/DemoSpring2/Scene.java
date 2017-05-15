package com.gtm.DemoSpring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scene {

	public static void main(String[] args) {
		// 1- Chargement du conteneur et creation des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spectacle.xml");
		
		// 2- recuperation d'un bean
		Musicien olivier = (Musicien) appContext.getBean("Olivier");
		Musicien caroline = (Musicien) appContext.getBean("Caroline");
		Musicien jeanMarc = (Musicien) appContext.getBean("Jean-Marc");
		
		// 3- Traitement
		System.out.println("--------- OLIVIER -----------");
		olivier.performe();
		System.out.println("--------- CAROLINE ----------");
		caroline.performe();
		System.out.println("--------- JEAN-MARC ----------");
		jeanMarc.performe();
		appContext.close();
	}

}
