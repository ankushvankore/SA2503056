package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D25HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Alert alt;
		
		WebElement btn1 = driver.findElement(By.id("alertButton"));
		js.executeScript("arguments[0].click()", btn1);
		
		alt = driver.switchTo().alert();	//Jump to alert
		System.out.println(alt.getText());
		alt.accept();		//Click on Ok button
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("timerAlertButton")));
		Thread.sleep(5000);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		js.executeScript("window.scrollBy(0, 300)", "");
		
		driver.findElement(By.id("confirmButton")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();		//Click on Cancel button
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		driver.findElement(By.id("promtButton")).click();
		alt = driver.switchTo().alert();
		alt.sendKeys("Laxmikant");
		alt.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		Thread.sleep(5000);
		driver.close();
	}

}
