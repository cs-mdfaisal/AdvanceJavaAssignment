package com.phoenix.statics.imports.main;

import com.phoenix.vehicles.Car;
import static java.lang.Integer.parseInt;
import static com.phoenix.vehicles.Car.count;

public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt("700");
		System.out.println(a);
		
		int b=Integer.parseInt("20");
		System.out.println(b);
		
		System.out.println("No of car ojects "+count);
	
		Car c1=new Car();
		Car c2 =new Car(121,"Mercedes Benz",4500000.00f);
		System.out.println("No of car object"+c2);
	}

}
