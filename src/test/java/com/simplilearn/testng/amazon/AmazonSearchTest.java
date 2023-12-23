package com.simplilearn.testng.amazon;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonSearchTest {
	// step1: formulate a test domain url & driver path
		String siteUrl = "https://www.amazon.in/";
		String driverPath = "drivers/Windows/chromedriver.exe";
		WebDriver driver;

		@BeforeClass
		public void beforeClass() {

			// step2: set system properties for selenium dirver
			System.setProperty("webdriver.chromedriver.driver", driverPath);

			// step3: instantiate selenium webdriver
			driver = new ChromeDriver();

			// step4: launch browser
			driver.get(siteUrl);
		}

		@AfterClass
		public void afterClass() {
			driver.quit();
		}
		@Test (description = "Search Iphone 15 pro max")
		public void testSearch1() throws InterruptedException {
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys("Iphone 15 pro max");
			searchBox.submit();

			// add delay 
			Thread.sleep(2000);
			
			String expectedTitle = "Amazon.in : Iphone 15 pro max";
			String actualTitle = driver.getTitle();
			
			assertEquals(actualTitle, expectedTitle);
		}

		
		@Test (description = "Apple Mac book")
		public void testSearch2() throws InterruptedException {
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.clear();
			searchBox.sendKeys("Apple Mac book");
			searchBox.submit();

			// add delay 
			Thread.sleep(2000);
			
			String expectedTitle = "Amazon.in : Apple Mac book";
			String actualTitle = driver.getTitle();
			
			assertEquals(actualTitle, expectedTitle);
		}
		
		@Test (description = "Search for TCS Tv")
		public void testSearch3() throws InterruptedException {
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.clear();
			searchBox.sendKeys("TCS Tv");
			searchBox.submit();

			// add delay 
			Thread.sleep(2000);
			
			String expectedTitle = "Amazon.in : TCS Tv";
			String actualTitle = driver.getTitle();
			
			assertEquals(actualTitle, expectedTitle);
		}

}
