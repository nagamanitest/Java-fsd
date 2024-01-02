package com.simplilearn.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestExample {
	
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
	@RepeatedTest(5)
	@Test
	@DisplayName("Should return valid age for +ve year")
	public void test1()
	{
		int eResult = 33;
		int aResult = agecalculator.calculateAge(1990);
		assertEquals(eResult,aResult);
	}
	
	@RepeatedTest(value = 2,name = "{displayName}- repetition - {currrentRepetition} of {totalRepetitions}")
	@Test
	@DisplayName("Calculate Test")
	public void test2()
	{

		assertEquals(33,agecalculator.calculateAge(1990));
		assertEquals(30,agecalculator.calculateAge(1993));
	}
	@RepeatedTest(value = 2,name = RepeatedTest.LONG_DISPLAY_NAME)
	@Test
	@DisplayName("Age Calculate LONG NAME")
	public void test3()
	{

		assertEquals(33,agecalculator.calculateAge(1990));
		assertEquals(30,agecalculator.calculateAge(1993));
	}
	@RepeatedTest(value = 2,name = RepeatedTest.SHORT_DISPLAY_NAME)
	@Test
	@DisplayName("Age Calculate SHORT NAME")
	public void test4()
	{

		assertEquals(33,agecalculator.calculateAge(1990));
		assertEquals(30,agecalculator.calculateAge(1993));
	}

}
