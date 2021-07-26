package com.phoenix.vehicles.main;

import com.phoenix.vehicles.Car;

public class HashcodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		System.out.println("Hashcode of s1: "+ s1.hashCode());
		System.out.println("Hashcode of s2: "+ s2.hashCode());
		
		
		Car car1= new Car(101,"Tata Nexon",7500000.00f);
		Car car2= new Car(101,"Tata Nexon",7500000.00f);
		
		System.out.println("Hashcode of car1: "+ car1.hashCode());
		System.out.println("Hashcode of car2: "+ car2.hashCode());
	}

}
