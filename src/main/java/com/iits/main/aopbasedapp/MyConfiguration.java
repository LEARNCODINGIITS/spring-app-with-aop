package com.iits.main.aopbasedapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.iits.main.aopbasedapp"})
@EnableAspectJAutoProxy //It is scanning @Aspect
public class MyConfiguration {

	
	@Bean("myservice")
	public MyService myservice() {
		return new MyService();
	}
}
