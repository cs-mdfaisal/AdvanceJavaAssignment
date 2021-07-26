package com.phoenix.math.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

public class CalculatorServiceTest {

	private static CalculatorService calciService;
	
	
	@BeforeClass
	public static void init() {
		calciService=new CalculatorService(new Calculator());
		
	}
	@Test
	public void testAddition() {
		assertEquals(30, calciService.addition(10, 20));
			
			
	}
	@Test
	public void testDivision() {
		assertEquals(2, calciService.division(10, 5));
	}
	@Test(expected=ArithmeticException.class)
	public void checkDivideByZeroException(){
		assertEquals(2, calciService.division(10, 0));
	}
	
	
	@AfterClass
	public static void clean() {
		calciService = null;
	}

}
