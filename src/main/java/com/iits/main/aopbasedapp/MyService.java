package com.iits.main.aopbasedapp;

import org.springframework.stereotype.Service;

@Service("myservice")
public class MyService {

	public void addEmployee() {
		System.out.println("--adding employee to the database");
	}
	public void updateEmployee() {
		System.out.println("--updating employee to the database");
	}
	public void deleteEmployee() {
		System.out.println("--delete employee to the database");
	}

}
