package com.simplilearn.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class AssumeAppTest {
	
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
	public void testOnDev() {
		// set an system property as ENV key.
		System.setProperty("ENV", "DEV");
		// validation test with assumption that env is dev.
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	}
	@Test
	public void testOneQA()
	{
		System.setProperty("ENV","Dev");
		Assumptions.assumeFalse("QA".equals(System.getProperty("ENV")));
	}
	@Test
	public void testOneProd()
	{
		System.setProperty("ENV","PROD");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")),  AssumeAppTest::message);
	}
	@Test
	public void testInAllEnvs()
	{
		System.setProperty("ENV","Dev");
		assumingThat("DEV".equals(System.getProperty("ENV")),()-> {
			assertEquals(33,agecalculator.calculateAge(1991));
			
		});
		assertEquals(29,agecalculator.calculateAge(1994));
	}
	private static String message()
	{
		return ":: Test Assumption Failed :: ";
	}

}
