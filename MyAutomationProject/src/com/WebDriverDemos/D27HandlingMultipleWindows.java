package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D27HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.naukri.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)", "");
		
		driver.findElement(By.xpath("//span[@title=\"Remote\"]")).click();
		System.out.println("Tltle: " + driver.getTitle());
		
		Set<String>windows = driver.getWindowHandles();
		//System.out.println(windows);
		Iterator<String>itr = windows.iterator();	
		//Iterator will help to iterate over the Set or
		//will able to read the values one by one from Set
		String win1 = itr.next();		//Read the 1st value
		String win2 = itr.next();		//Read 2nd value
		
		//System.out.println(win1);
		//System.out.println(win2);
		
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"search-result-container\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/label/i")).click();
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		
		driver.quit();
	}

}
