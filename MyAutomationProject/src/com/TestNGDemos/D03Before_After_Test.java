package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_After_Test {
	WebDriver driver;
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	@Test (priority = 3)
	public void launchMyntra() {
		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 4)
	public void launchFlipkart() {
		driver.get("https://www.flipkart.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 1)
	public void launchLenskart() {
		driver.get("https://www.lenskart.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test(priority = 2)
	public void launchAmazon() {
		driver.get("https://www.amazon.in/");
		System.out.println("Title: " + driver.getTitle());
	}
	@BeforeTest
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
