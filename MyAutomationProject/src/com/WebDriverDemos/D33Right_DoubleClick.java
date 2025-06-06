package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D33Right_DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		
		WebElement rightClickBtn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		//act.contextClick(rightClickBtn).perform();
		act.moveToElement(rightClickBtn).contextClick().perform();
		
		List<WebElement>menus = driver.findElements(By.xpath("//*[@id=\"authentication\"]/ul/li/span"));
		for(WebElement m : menus)
			System.out.println(m.getText());
		
		driver.findElement(By.id("authentication")).click();
		//To click somewhere in the blank page so that the menu which was 
		//displayed earlier will get disappeared
		
		WebElement dblClickBtn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		//act.doubleClick(dblClickBtn).perform();
		act.moveToElement(dblClickBtn).doubleClick().perform();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//act.moveToElement(dblClickBtn).click();
		//act.click(dblClickBtn).click();
		
		driver.close();
	}

}
