package com.TestNGDemos;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class D08ReadParametersFromXML {
	WebDriver driver;
	JavascriptExecutor js;
	
	//For reading the values of respective parameters from xml file
	@Parameters({"userName", "password"})
	@Test
	public void login(String un, String ps) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		//Thread.sleep(5000);
		
		js.executeAsyncScript("arguments[0].click()", driver.findElement(By.linkText("Logout")));
	}

	@BeforeTest
	public void beforeTest() {
		Map<String, Object>pref = new HashMap<>();
		pref.put("profile.credentials_enable_serve", false);
		pref.put("profile.password_manager_leak_detection", false);
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("prefs", pref);
		
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/login");
		
		js = (JavascriptExecutor) driver;
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
