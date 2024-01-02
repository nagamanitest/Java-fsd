package com.simplilearn.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Age Calculator")

public class AgeCalculatorTest {
	
	Agecalculator agecalculator;
	
	@BeforeEach()
	public void setUp()
	{
		agecalculator = new Agecalculator();
	
	}
	@AfterEach()
	public void cleanup()
	{
		if(agecalculator!=null)
			agecalculator = null;
	}
	@Test
	@DisplayName("Should return valid age for +ve year")
	public void test1()
	{
		int eResult = 33;
		int aResult = agecalculator.calculateAge(1990);
		assertEquals(eResult,aResult);
	}
	@Test
	@DisplayName("Should return 0 age for -ve year")
	public void test2() {
		 assertEquals(0, agecalculator.calculateAge(-1995));
	}
	
	@Test
	@DisplayName("Should return 0 age for 0 year")
	public void test3() {
		 assertEquals(0, agecalculator.calculateAge(0));
	}
	
	@Test
	@DisplayName("Should return 0 age for +ve future year")
	public void test4() {
		assertEquals(0, agecalculator.calculateAge(2050));
	}

}
