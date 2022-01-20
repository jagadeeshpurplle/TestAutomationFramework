package com.test.automation.TestAutomation;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String address;
	
	public Address() {
		this.address = "1-35, Ghantaslaa";
	}
	
	public String getAddress() {
		return address;
	}
	

}
