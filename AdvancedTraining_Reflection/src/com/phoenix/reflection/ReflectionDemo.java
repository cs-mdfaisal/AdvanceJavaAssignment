package com.phoenix.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.phoenix.models.Product;

public class ReflectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//Class c=Class.forName("com.phoenix.models.Product");
			//Class c=Class.forName("java.lang.Integer");
			Class c=Class.forName("com.phoenix.models.ElectronicProduct");
			
			System.out.println("loaded");
		
			
		//creating an object using reflection
			/*Product p=(Product) c.newInstance();
			System.out.println("Object of product is created using reflection");
			p.setId(1001);
			p.setName("Mobile");
			p.setBrand("Samsung");
			p.setPrice(23400.00f);
			System.out.println(p);*/
		
		Field fArr[]=c.getFields();
		//Field fArr[]=c.getDeclaredFields();When you want private but doest not display inherited member
		for(Field f:fArr) {
			//System.out.println(f.getName());
			System.out.println(f);
		}
		
		
		Method mArr[]=c.getMethods();
		//Field fArr[]=c.getDeclaredFields();doest not display inherited member
		for(Method m:mArr) {
			//System.out.println(m.getName());
			System.out.println(m);
		}
		
		System.out.println();
		Constructor cArr[]=c.getConstructors();
		//Constructor cArr[]=c.getDeclaredConstructors();
		for(Constructor cr:cArr) {
			System.out.println(cr.getName());
			System.out.println(cr);
			
		}
		
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
