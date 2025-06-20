package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S05AmazonLinks {
	WebDriver driver;
	
	//@Before
	public void beforeScenario()
	{
		System.out.println("Before Hook");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.amazon.in/");
	}
	//@After
	public void closeBrowser()
	{
		driver.close();
		System.out.println("After hook");
	}
	
	@Given("Launch Amazon site")
	public void launch_amazon_site() {
		System.out.println("Before Hook");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.amazon.in/");
	}

	@When("Click on Sell link")
	public void click_on_sell_link() {
	    driver.findElement(By.partialLinkText("Sell")).click();
	}

	@Then("Sell page should display")
	public void sell_page_should_display() {
	    System.out.println(driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Categories"));
	}

	@When("Click on BestSellers link")
	public void click_on_best_sellers_link() {
	    driver.findElement(By.partialLinkText("Best")).click();
	}

	@Then("Bestsellers page should display")
	public void bestsellers_page_should_display() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Bestsellers"));
	}

	@When("Click on Mobiles link")
	public void click_on_mobiles_link() {
		driver.findElement(By.partialLinkText("Mobile")).click();
	}

	@Then("Mobiles page should display")
	public void mobiles_page_should_display() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Mobile"));
	}

	@When("Click on Todays deal link")
	public void click_on_todays_deal_link() {
		driver.findElement(By.partialLinkText("Today")).click();
	}

	@Then("Todays deal page should display")
	public void todays_deal_page_should_display() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Deals"));
	}
}
