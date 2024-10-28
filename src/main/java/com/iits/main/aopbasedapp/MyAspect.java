package com.iits.main.aopbasedapp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	public MyAspect() {
		System.out.println("--MyAspect--");
	}
	
	@Pointcut("execution(* com.iits.main.aopbasedapp.MyService.*(..)))")
	public void performance() {}
	
	@Before("performance()")
	public void beforeOperation() {
		System.out.println("--before--");
	}
	@After("performance()")
	public void afterOperation() {
		System.out.println("--after--");
	}

}
