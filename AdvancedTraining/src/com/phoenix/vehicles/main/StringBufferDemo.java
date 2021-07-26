package com.phoenix.vehicles.main;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		//StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("Size: "+sb.length());
		sb.append("Hello");
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("Size: "+sb.length());
		sb.append("This is StringBufferDemo");
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("Size: "+sb.length());
		
		//sb.reverse();
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("Size: "+sb.length());
		System.out.println(sb);
		
		String s = sb.reverse().toString();
		System.out.println(s);
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("Hello World");
		System.out.println(sb1);
		sb1.insert(6, "Great ");
		System.out.println(sb1);
		
		sb1.replace(6, 11, "XXXXX");
		System.out.println(sb1);
		
		
	}

}
