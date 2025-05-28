package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D08LocateByCssSelector_Attribute {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.cssSelector("input[autofocus=\"1\"]"));
		userName.sendKeys("ankushvankore@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[aria-label=\"Password\"][placeholder=\"Password\"]"));
		password.sendKeys("1234567890");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
		loginBtn.click();
	}

}
