package com.iits.main.aopbasedapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
     ApplicationContext context
     =new AnnotationConfigApplicationContext(MyConfiguration.class);
     MyService service=(MyService)context.getBean("myservice");
     service.addEmployee();
     service.updateEmployee();
     service.deleteEmployee();
         
    }
}
