package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D32MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://istqb.in/");
		
		Actions act = new Actions(driver);
		//Actions class is used to handle mouse actions
		
		List<WebElement> menus = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li"));
		for(WebElement m : menus)
			System.out.println(m.getText());
		
		WebElement spMenu = driver.findElement(By.linkText("SPECIALIST"));
		act.moveToElement(spMenu).perform();
		
		List<WebElement>subMenus = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[6]/div/div/ul/li/a"));
		System.out.println("\nSub menus are");
		for(WebElement sm : subMenus)
			System.out.println(sm.getText());
		
		Thread.sleep(1000);
		driver.close();
	}

}
