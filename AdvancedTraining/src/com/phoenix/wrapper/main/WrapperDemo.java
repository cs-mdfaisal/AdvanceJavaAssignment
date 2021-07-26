package com.phoenix.wrapper.main;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Wraapping
		int a=10;
		Integer i1=Integer.valueOf(a);//wrapping
		System.out.println(i1);
		
		int c=i1.intValue();//unwrapping
		System.out.println(i1);
		
		String s="200";
		//String s="200a"; exception number
		int b=Integer.parseInt(s);
		System.out.println(b);
		
		//Boolean b1=Boolean.valueOf(false);
		//Boolean b1=Boolean.valueOf("True");
		Boolean b1=Boolean.valueOf("Hello");
		//Boolean b1=Boolean.valueOf(null);
		
		System.out.println(b1);
		
		int m=Integer.max(20, 300);
		System.out.println("Maxx value: "+m);
		
		
		
	}

}
