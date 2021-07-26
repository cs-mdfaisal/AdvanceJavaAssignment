package com.phoenix.string.main;

import com.phoenix.vehicles.Car;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello";
		//String s2 = "Hello";
		
		//String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		
		if(s1==s2)
			System.out.println("single object");
		else
			System.out.println("different object");
		
		
		
		if(s1.equals(s2))
			System.out.println("same content");
		else
			System.out.println("different content");
		
		
		String s3=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s3);
		
		String s4=s1+"World";
		System.out.println(s1);
		System.out.println(s4);
		
		String s5=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s5);
		
		System.out.println("size of s5: "+s5.length());
		
		String color = "green";
		switch(color) {//since java 7
		case "red":
			System.out.println("red color");
			break;
		case "green":
			System.out.println("green color");
			break;
		case "blue":
			System.out.println("blue color");
			break;
		default:
			System.out.println("No color");
		}
		
		//////////
		
		Car car1= new Car(101,"Tata Nexon",7500000.00f);
		Car car2= new Car(101,"Tata Nexon",7500000.00f);
	
		if(car1==car2)
			System.out.println("single object");
		else
			System.out.println("different object");
	
	}
		
		

}
