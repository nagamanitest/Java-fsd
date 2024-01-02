package com.simplilearn.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

public class ClaculatorTest {
	
	@Test
	@DisplayName("Should test default method with +ve values")
	void testMultiply1()
	{
		//create an instance of calculator with anonymous class implementation
		Calculator calculator = new Calculator() {
			@Override
			public int add(int num1,int num2) {
				return num1+num2;			
				}
		};
		
		int aResult = calculator.multiply(10, 200);
		int eResult = 2000;
		assertEquals(eResult,aResult,"Multiplication of 10x200 should be 2000");
	}
	@Test
	@DisplayName("Should test default method with 0 and  +ve values")
	void testMultiply2()
	{
		//create an instance of calculator with anonymous class implementation
		Calculator calculator = new Calculator() {
			@Override
			public int add(int num1,int num2) {
				return num1+num2;			
				}
		};
		
		int aResult = calculator.multiply(0, 200);
		int eResult = 0;
		assertEquals(eResult,aResult,"Multiplication of 0x200 should be 0");
	}
	@Test
	@DisplayName("Should test default method with -ve values")
	void testMultiply3()
	{
		//create an instance of calculator with anonymous class implementation
		Calculator calculator = new Calculator() {
			@Override
			public int add(int num1,int num2) {
				return num1+num2;			
				}
		};
		
		int aResult = calculator.multiply(-10, 200);
		int eResult = -2000;
		assertEquals(eResult,aResult,"Multiplication of -10x200 should be -2000");
	}



}
