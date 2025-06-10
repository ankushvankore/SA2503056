package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02LaunchOnlineShoping {
	@Test (priority = 3)
	public void launchMyntra() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	@Test (priority = 4)
	public void launchFlipkart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	@Test (priority = 1)
	public void launchLenskart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.lenskart.com/");
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	@Test(priority = 2)
	public void launchAmazon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
}
