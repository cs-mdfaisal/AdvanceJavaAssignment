package com.phoenix.interfaces.functional;

public interface Addable {

	
	int add(int a,int b);
	
	default float addFloats(float a,float b) {
		return a+b;
	}
	static void show() {
		System.out.println("show of Addable");
	}

	


}
