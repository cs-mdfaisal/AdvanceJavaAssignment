package com.phoenix.math.services;

import com.phoenix.math.Calculator;

//service class
public class CalculatorService {
	
	private Calculator calci;
	
	
	public CalculatorService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CalculatorService(Calculator calci) {
		super();
		this.calci = calci;
	}

	//Application Business logic method
	public int addition(int a,int b) {
		return calci.add(a, b);
	}
	public int division(int x,int y) {
		return calci.divide(x,y);
		
	}

	
	
}
