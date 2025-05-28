package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A04Echotrak_ClassName {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.id("txtCustomerID"));
		userName.sendKeys("Ankush");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("ankush123");
		WebElement loginBtn = driver.findElement(By.className("btn-lg"));
		loginBtn.click();
		
		WebElement errorMsg = driver.findElement(By.className("error"));
		String msg = errorMsg.getText();
		
		System.out.println(msg);
		
		if(msg.contains("Invalid"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
	}

}
