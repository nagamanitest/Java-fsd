package com.simplilearn.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RetirementCalculator {
	
Agecalculator agecalculator;
	
	@BeforeEach
	public void setUp() {
		agecalculator  = new Agecalculator();
	}

	@AfterEach
	public void cleanUp() {
		if(agecalculator!=null)
			agecalculator = null;
	}
	@Test
	@Disabled()
	public void test1() {
		
		int age  = calculateAge(yearOfBirth);
		int retAge = 60;
		
	}

}
