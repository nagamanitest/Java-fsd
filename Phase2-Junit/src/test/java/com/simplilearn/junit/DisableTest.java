package com.simplilearn.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@DisplayName("Test Age calculator")

public class DisableTest {
	
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
	@Disabled
	@DisplayName("Should return valid age for +ve year")
	public void test1()
	{
		int eResult = 33;
		int aResult = agecalculator.calculateAge(1990);
		assertEquals(eResult,aResult);
	}
	@Test
	@DisabledOnOs(value = OS.WINDOWS)
	@DisplayName("Should return 0 age for -ve year")
	public void test2() {
		 assertEquals(0, agecalculator.calculateAge(-1995));
	}
	
	@Test
	@DisabledOnJre(value = JRE.JAVA_17)
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
