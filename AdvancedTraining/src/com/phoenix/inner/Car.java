package com.phoenix.inner;

import com.phoenix.annotations.CopyrightInfo;

//Outer class
@CopyrightInfo(copyright="Sterlite",author="md.faisal")
public class Car {
	
	
	public void show() {
		ferrari.test();
		d.drive();
	}
	
	//Anonymous Inner class-subclass of ferrari
	Ferrari ferrari =new Ferrari() {
		private String model;
		
		{
			model="Ferrari Sport";
		}
		public void showModel() {
			System.out.println(model);
		}
		
		public void test() {
			showModel();
			System.out.println("Anonymous "+model);
		}
	};
	//Anonymous Inner class - interface implementor	
	Drivable d=new Drivable() {

		@Override
		public void drive() {
			// TODO Auto-generated method stub
			System.out.println("Anonymous drivable");
		}
	};
}