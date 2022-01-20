package com.test.automation.TestAutomation;

public class Test {

public static void main(String[] args) {

	
	int price = 10899989;
	String name = "jagadeesh";
	Boolean s = true;
	double d = 11111111111.0;
//	System.out.println(price +"\t"+name+"\t"+s +"\t"+d +"\t");
	
	if(name.equals("jagadesh")) {
		System.out.println("Hey this is jagdaeesh");
	}else {
		System.out.println("Hey this is Abhi");
	}
	
	String switchOffOn= "led fan";
	switch(switchOffOn) {
	
	case "fan":
		System.out.println("fan is working");
		break;
		
	case "ledBulb":
		System.out.println("led bulb is working");
		break;
	case "tubeLight":
		System.out.println("tubelight is working");
		break;
		default:
			System.out.println("swithc is not related to any of the bulb");
			break;
	
	}
	
	
	int n = 2;
	n++;
	
	for(int i=0;i<10;i++) {
		System.out.println(n++);
	}
	
	boolean boatOnButtonPress = true;
	while(boatOnButtonPress) {
		System.out.println("processing");
		System.out.println("connected");
		boatOnButtonPress= false;
	}
	
	}	
}
