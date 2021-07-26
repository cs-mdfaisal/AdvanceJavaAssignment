package com.phoenix.math.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

class CalculatorServiceTest {

	private static CalculatorService calService;
	
	//@BeforeEach	//initialization logic
	@BeforeAll
	public static void init() {
		calService = new CalculatorService(new Calculator()); 
	}
	
	
	@Test	//test method- test case
	public void testAddition() {
		
		int expectedResult =30;
		//testing service
		int actualResult = calService.addition(20, 20);
		
		//testing service functionality
		//assertEquals(expectedResult,actualResult);
		assertNotEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void checkDivision() {
		assertEquals(2, calService.division(10, 5));
	}
	
	@Test
	public void checkDivideByZeroException() {
		assertThrows(ArithmeticException.class,()->calService.division(10,0));
	}
	
	
	//@AfterEach	//cleAN UP LOGIC
	@AfterAll
	public static void clean() {
		calService=null;
		
	}
	
	
	
}
