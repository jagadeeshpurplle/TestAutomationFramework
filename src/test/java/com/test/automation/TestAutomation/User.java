package com.test.automation.TestAutomation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Autowired
	private Address address;
	
	@Autowired
	private Salary salary;
	
//	@Autowired
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//	@Autowired
//	public void setSalary(Salary salary) {
//		this.salary = salary;
//	}	
	
//	public User(Address address, Salary salary) {
//		this.address = address;
//		this.salary = salary;
//	}
	
	public void printDetails() {
		System.out.println("Address: "+address.getAddress());
		System.out.println("Salary: "+salary.getSalary());
		
	}
}
