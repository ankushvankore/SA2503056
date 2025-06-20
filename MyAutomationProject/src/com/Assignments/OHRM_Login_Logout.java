package com.Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class OHRM_Login_Logout {
	WebDriver driver;

	@AfterMethod
	public void logout()
	{
		if(driver.getCurrentUrl().contains("dashboard")) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
		}
		else
		{
			System.out.println("Invalid user name / password");
		}
	}

	@Test
	public void loginToOHRM1() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void loginToOHRM2() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("deepak");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("deepak123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void loginToOHRM3() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void loginToOHRM4() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("bittu");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("bittu123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}



	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
