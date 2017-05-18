package com.gtm.DemoSpring2.intercepteurs;

import org.aspectj.lang.ProceedingJoinPoint;

public class Musiciens {

	public Musiciens(){
		
	}
	public Object jeJoue(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Je je j j joue");
		return pjp.proceed();
	}
}
