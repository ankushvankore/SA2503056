package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D05LenskartAssignment {
	WebDriver driver;

	@Test(priority = 1, groups = "group1")
	public void clickOnEyeGlasses() {
		driver.findElement(By.partialLinkText("Eyeglasses")).click();
	}

	@Test(priority = 2, groups = "group1")
	public void clickOnScreenGlasses() {
		driver.findElement(By.id("lrd2")).click();
	}

	@Test(priority = 3, groups = "group2")
	public void clickOnKidsGlasses() {
		driver.findElement(By.id("lrd11")).click();
	}

	@Test(priority = 4, groups = "group2")
	public void clickOnSunGlasses() {
		driver.findElement(By.partialLinkText("Sunglasses")).click();
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		driver.get("https://www.lenskart.com/");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		driver.close();
	}

}
