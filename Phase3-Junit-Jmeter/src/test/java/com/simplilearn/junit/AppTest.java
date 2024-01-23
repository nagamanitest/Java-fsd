package com.simplilearn.junit;

import static org.junit.Assert.fail;

import org.junit.Test;


public class AppTest
{
   
	@Test
	public void passedTest() {
		System.out.println("-- Passed Test. --");
	}
	
	@Test
	public void failedTest() {
		System.out.println("-- Failed Test. --");
		fail();  // failed assertion
	}
}
