package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class D18HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);
		
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>countryList = countries.getOptions();
		System.out.println("Total Countries: " + countryList.size());
		
		int i = 0;
		for(WebElement c : countryList)
		{
			System.out.println(i + ". " + c.getText());
			i++;
		}
		/*
		 * If you want to perform any operation on the list then use countryList object
		 * To perform any operation on actual dropdown list then use countries object (Select class)
		 */
		//countries.selectByVisibleText("United Kingdom");
		//countries.selectByValue("221");
		//countries.selectByIndex(218);
		countries.selectByContainsVisibleText("Kingdom");
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
	}

}
