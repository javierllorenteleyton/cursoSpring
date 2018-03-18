package com.privalia.calculatorexample.integration.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.privalia.calculatorexample.Calculator;
import com.privalia.calculatorexample.ICalculator;

import junitparams.Parameters;
import junitparams.JUnitParamsRunner;;

@RunWith(JUnitParamsRunner.class)
public class CalculatorIntegrationTest {

	 @Test
	 @Parameters({"1,2,3","-10,30,20","15,-5,10","-5,-10,-15"})
	 public void testAdd(int num1,int num2,int expectedResut) {
		 ICalculator calculator = new Calculator();
		 assertTrue(calculator.add(num1, num2)== expectedResut);
	 }
	 @Test
	 @Parameters({"3,2,1","-10,30,-40","15,-5,20","-5,-10,5"})
	 public void testSubstract(int num1,int num2,int expectedResut) {
		 ICalculator calculator = new Calculator();
		 assertTrue(calculator.substract(num1, num2)== expectedResut);
	 }
}
