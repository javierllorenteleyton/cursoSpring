package com.privalia.calculatorexample.unit.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.privalia.calculatorexample.ICalculator;



public class CalculatorTest {

	@Mock
	ICalculator iCalculator;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testAdd() {
		when(iCalculator.add(2,3)).thenReturn(5);
		assertTrue(iCalculator.add(2,3) == 5);
	}
	
	@Test
	public void testSubstract() {
		when(iCalculator.substract(10,5)).thenReturn(5);
		assertTrue(iCalculator.substract(10,5) == 5);
	}
	
	@Test
	public void testMultiply() {
		when(iCalculator.multiply(10,5)).thenReturn(50);
		assertTrue(iCalculator.multiply(10,5) == 50);
	}
	@Test
	public void testDivide() {
		when(iCalculator.divide(10,5)).thenReturn(2);
		assertTrue(iCalculator.divide(10,5) == 2);
	}

}
