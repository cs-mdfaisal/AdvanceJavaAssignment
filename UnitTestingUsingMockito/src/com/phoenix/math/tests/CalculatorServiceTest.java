package com.phoenix.math.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.phoenix.math.Calculator;
import com.phoenix.math.services.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
 public class CalculatorServiceTest {

	 @Mock
	private CalculatorService calciService;
	
	 @InjectMocks
	private Calculator calculator;
	
	@Before
	public void initService() {
		//creating mock object of calculationService
		//calciService=Mockito.mock(CalculatorService.class);
		//calciService = Mockito.spy(CalculatorService.class);
		//creating partial mock-wrapper over real object
		calciService = Mockito.spy(new CalculatorService());
	
	}
	@Test
	public void testAddition() {
		//creating mock behavior of mock object
		Mockito.when(calciService.addition(100, 200)).thenReturn(50);
		
		//creating behavior on real method
		//Mockito.when(calciService.addition(100, 200)).thenCallRealMethod();
		
		assertEquals(50, calciService.addition(100, 200));
	}
	@After
	public void clean() {
		calciService=null;
	}

}
