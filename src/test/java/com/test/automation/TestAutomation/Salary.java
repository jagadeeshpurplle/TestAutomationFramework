package com.test.automation.TestAutomation;

import org.springframework.stereotype.Component;

@Component
public class Salary {
	
	private int salary;
	
	public int getSalary() {
		return salary;
	}

	public Salary() {
		this.salary = 100000;
	}
	
	

}
