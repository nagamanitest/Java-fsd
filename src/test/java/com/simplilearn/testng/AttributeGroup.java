package com.simplilearn.testng;

import org.testng.annotations.Test;

public class AttributeGroup {
	
	@Test(description="Sample Test one",priority=1)
	public void testOne()
	{
		System.out.println("--Test one is executed--");
	}
	
	@Test(description="Sample test two",priority=2)
	public void testTwo()
	{
		System.out.println("--Test Two is executed----");
	}
	
	@Test(description="Sample test three",dependsOnMethods = {"testOne","testTwo"},enabled = false)
	public void testThree()
	{
		System.out.println("--Test Three is executed---");
	}
	
	@Test(groups = "Regression Test")
	public void r1()
	{
		System.out.println("--Test r1 is executed--");
	}
	
	@Test(groups = "Regression Test",timeOut=200)
	public void r2() throws InterruptedException
	{
		Thread.sleep(100);
		System.out.println("--Test r2 is executed--");
	}
	
	@Test(groups = "Regression Test", dependsOnGroups = {"Regression Test"},alwaysRun = true)
	public void r3()
	{
		System.out.println("--Test r3 is executed--");
	}



}
