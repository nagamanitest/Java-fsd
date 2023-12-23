package com.simplilearn.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAnnotationTest {
	
	@BeforeSuite
	public void setUpBeforeSuite()
	{
		System.out.println("--Before Suite--");
	}
	@AfterSuite
		public void cleanAfterSuite()
		{
			System.out.println("--After Suite---");
		}
	
	@BeforeMethod
	public void setUpBeforeMethod()
	{
		System.out.println("--Before Method--");
	}
	@AfterMethod
	public void cleanAfterMethod()
	{
		System.out.println("--After Method--");
	}
	
	@Test
	public void testOne() {
		System.out.println("------Test one is executed------");
	}
	@Test
	public void testTwo()
	{
		System.out.println("---Test two is executed---");
	}
	@Test
	public void testthree()
	{
		System.out.println("Test three is executed");
	}
	
	
}
