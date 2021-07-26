package com.phoenix.wrapper.main;

public class AutoboxingUnboxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		Integer i1=Integer.valueOf(a);//wrappig
		
		//unwrapping
		int b=i1.intValue();
		System.out.println(b);
		
		//Autoboxing
		int x=500;
		System.out.println(x);
		Integer i2=x;//Autoboxing
		System.out.println(i2);
		
		int y=i2;//Autounboxing
		System.out.println(y);
		
		Boolean b1=true;//Autoboxing
		System.out.println(b1);
		
		boolean b2=b1;//Autounboxing
		System.out.println(b2);
		
		char ch='d';
		Character c1=ch;//Autoboxing
		System.out.println(ch);
		
		char ch1=c1;
		System.out.println(ch1);//Autounboxing
		
		Integer i5=100;
		float f1=100.00f;
		if(i5==f1)
			System.out.println("True");
		else
			System.out.println("False");
		
		////
		int n1=100;
		Integer ob=n1;//Autoboxing
		
		float f=n1;//implicit conversion
		//Float f2=n1;//Autoboxing rule is vioated
		
		int n2=ob;//Autounboxing
		float f3=ob;//Autounboxing and implicit conversion
	}

}
