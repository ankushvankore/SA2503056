package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04Before_After_Method {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void printTitle()
	{
		System.out.println("Title: " + driver.getTitle());
		System.out.println("After Method");
	}

	@Test(priority = 3)
	public void launchMyntra() {
		driver.get("https://www.myntra.com/");
	}

	@Test(priority = 4)
	public void launchFlipkart() {
		driver.get("https://www.flipkart.com/");
	}

	@Test(priority = 1)
	public void launchLenskart() {
		driver.get("https://www.lenskart.com/");
	}

	@Test(priority = 2)
	public void launchAmazon() {
		driver.get("https://www.amazon.in/");
	}

	
}
