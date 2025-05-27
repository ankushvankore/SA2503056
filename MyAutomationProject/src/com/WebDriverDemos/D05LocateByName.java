package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D05LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.name("email"));
		//An object userName is holding or referring to the control on the page
		userName.sendKeys("ankushvankore@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		//password.sendKeys("1234567890");
		String pass = "1234567890";
		password.sendKeys(pass);
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
	}

}
