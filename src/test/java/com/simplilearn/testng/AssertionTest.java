package com.simplilearn.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	
	@Test
	public void assetTest(){
	
	String name = "Shreya Reddy";
	int age = 23;
	String msg = null;
	boolean isMarried = false;
	
	assertEquals("Shreya Reddy",name);
	assertNotEquals("24",age);
	assertNull(msg);
	assertNotNull(age);
	assertFalse(isMarried);
	assertTrue(!isMarried);
	
	}
	@Test(description="Hard Assertion Test")
	public void hardAssert() {
		System.out.println("--Hard Assert started--");
		assertEquals("Shreya","Shreya");
		System.out.println("--Hard Assert ended--");
	}
	
	@Test(description="Soft Assertion Test")
	
		public void softAssert()
		{
		    SoftAssert softAssert = new SoftAssert();
			System.out.println("--Soft Assert started--");
			softAssert.assertEquals("Shreya","shreya");
			System.out.println("--Soft Assert ended--");
		}
	
	
	
	
	}


