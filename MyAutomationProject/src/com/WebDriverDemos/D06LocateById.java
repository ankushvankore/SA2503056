package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D06LocateById {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("ankushvankore@gmail.com");
		WebElement passwordBox = driver.findElement(By.id("pass"));
		passwordBox.sendKeys("1234567890");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

}
