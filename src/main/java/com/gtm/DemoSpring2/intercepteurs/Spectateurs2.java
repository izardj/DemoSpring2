package com.gtm.DemoSpring2.intercepteurs;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Spectateurs2 {

	public Spectateurs2(){}
	
	@Pointcut("execution(* *.performe(..))")
	public void performance(){}
	
	@Before("performance()")
	public void prendPlace(){
		System.out.println("Les spectateurs2 prennent place");
	}
	
	@Before("performance()")
	public void eteintTelephonesPortables(){
		System.out.println("Les spectateurs2 éteignent leur tél. portables");
	}
	
	@AfterReturning("performance()")
	public void applaudit(){
		System.out.println("Les spectateurs2 applaudissement");
	}
	
	@AfterThrowing("performance()")
	public void demandeRemboursement(){
		System.out.println("Bouh! Remboursez, remboursez!");
	}
	
	
}
