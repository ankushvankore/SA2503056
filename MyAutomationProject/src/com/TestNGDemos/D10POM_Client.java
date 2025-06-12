package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class D10POM_Client {
	WebDriver driver;
	RediffRegistration r1;
	@Test
	public void testRegistration() throws InterruptedException {
		r1.setFullName("Ankush Vankore");
		r1.chooseRedifId("ankushvankore");
		r1.checkAvaiablity();
		r1.setPassword("ankush@123");
		r1.confirmPassword("ankush@123");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffRegistration(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
