package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class A16DropDownList {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		
		Select newsLeter = new Select(driver.findElement(By.id("drop1")));
		List<WebElement>newsList = newsLeter.getOptions();
		
		for(WebElement n : newsList)
			System.out.println(n.getText());
		
		//newsLeter.selectByValue("jkl");
		newsLeter.selectByVisibleText("doc 3");
		
		System.out.println("Selected Option: " + newsLeter.getFirstSelectedOption().getText());
	}

}
