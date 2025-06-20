package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RediffRegistration {
	WebDriver driver;
	
	@FindBy (xpath = "//input[@placeholder='Enter your full name']") WebElement fullName;
	@FindBy (css = "input[name^=\"login\"]") WebElement rediffId;
	@FindBy (id = "country") WebElement drpList;
	
	public RediffRegistration(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	public void setFullName(String fn)
	{
		//driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
		fullName.sendKeys(fn);
	}
	public void chooseRedifId(String rid)
	{
		//driver.findElement(By.xpath("//*[@placeholder=\"Enter Rediffmail ID\"]")).sendKeys(rid);
		rediffId.sendKeys("ankushvankore");
	}
	public void checkAvaiablity() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@value=\"Check availability\"]")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div/span")).getText());
	}
	public void setPassword(String ps)
	{
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys(ps);
	}
	public void confirmPassword(String ps)
	{
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys(ps);
	}
	public void selectCountry()
	{
		
	}
}
