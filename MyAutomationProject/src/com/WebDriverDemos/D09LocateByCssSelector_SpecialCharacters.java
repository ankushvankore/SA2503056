package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D09LocateByCssSelector_SpecialCharacters {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		//* - Contains text
		WebElement userName = driver.findElement(By.cssSelector("input[placeholder*=\"address\"]"));
		userName.sendKeys("ankushvankore@gmail.com");
		//$ - Ends with
		WebElement password = driver.findElement(By.cssSelector("input[placeholder$=\"word\"]"));
		password.sendKeys("1234567890");
		//^ Starts with
		WebElement loginBtn = driver.findElement(By.cssSelector("button[id^=\"u_0_5\"]"));
		loginBtn.click();
	}

}
