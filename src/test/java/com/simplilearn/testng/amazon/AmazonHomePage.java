package com.simplilearn.testng.amazon;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AmazonHomePage {

	String siteUrl = "https://www.amazon.in/";
	String driverPath = "drivers/windows/geckodriver.exe";
	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.geckodriver.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(siteUrl);
	}

	@AfterMethod
	public void cleanUp() {
		driver.quit();  // the quit() method closes all browser windows and ends the WebDriver session.
		// driver.close(); // the close() closes only the current window on which Selenium is running automated tests.The WebDriver session, however, remains active. 
	}

	@Test(description = "Test Amazon Home Page Title Match")
	public void testAmazonHomePageTitle() {
		String expectedTitle  = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle  = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(description = "Test Amazon Home Page Source Url")
	public void testAmazonHomePageSourceUrl() {
		assertEquals(siteUrl, driver.getCurrentUrl());
	}
	
	@Test(description = "Test Amazon Home Page Title Invalid Match")
	public void testAmazonHomePageTitle2() {
		String expectedTitle  = "OOnline SShopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle  = driver.getTitle();
		assertNotEquals(actualTitle, expectedTitle);
	}
}