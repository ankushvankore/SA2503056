package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D11LocateByPartialLinkText {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		//WebElement adLink = driver.findElement(By.partialLinkText("isi"));
		//adLink.click();
		driver.findElement(By.partialLinkText("Adv")).click();
	}

}
