package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D10LocateByLinkText {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		WebElement adLink = driver.findElement(By.linkText("Advertising"));
		adLink.click();
	}

}
