package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A12EchoEchoCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://echoecho.com/htmlforms09.htm");
		
		//List<WebElement>products = driver.findElements(By.cssSelector("input[name^=\"option\"]"));
		List<WebElement>products = driver.findElements(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
		
		for(WebElement p : products)
		{
			System.out.println("Before...");
			System.out.println(p.getDomAttribute("value") + " Visible : " + p.isDisplayed());
			System.out.println(p.getDomAttribute("value") + " Enabled : " + p.isEnabled());
			System.out.println(p.getDomAttribute("value") + " Selected: " + p.isSelected());
			
			if(p.isSelected() == false)
				p.click();
			
			System.out.println("\nAfter...");
			System.out.println(p.getDomAttribute("value") + " Visible : " + p.isDisplayed());
			System.out.println(p.getDomAttribute("value") + " Enabled : " + p.isEnabled());
			System.out.println(p.getDomAttribute("value") + " Selected: " + p.isSelected());
		}
		
		
	}

}
