package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D09KeywordDrivenTesting {
	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;
	
	@Test
	public void login() {
		driver.findElement(By.name(prop.getProperty("nameUNTextBox"))).sendKeys("bindu");
		driver.findElement(By.id(prop.getProperty("idPsTxtBox"))).sendKeys("bindu123");
		driver.findElement(By.xpath(prop.getProperty("xpathLoginBtn"))).click();
		
		System.out.println(driver.findElement(By.cssSelector(prop.getProperty("cssError"))).getText());
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("D:\\StarAgile\\Demos\\SA2503056\\MyAutomationProject\\src\\com\\TestNGDemos\\MyData.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);			
		//Load all the properties from .properties file
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(prop.getProperty("url"));
		}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
