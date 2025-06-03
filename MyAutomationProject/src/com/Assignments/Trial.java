package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trial {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div[1]/div/div/input")).sendKeys("Kolh");
		driver.findElement(By.id("srcDest")).sendKeys("kolh");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/div/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("srcDest")).sendKeys("Pun");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/div")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[34]/div/div/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/button")).click();
		
		Thread.sleep(15000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"14540670\"]/div[2]/div[3]/div/div[1]")).getText());
		
		driver.close();*/
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("admin");
		//driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Log")).click();
		
		driver.close();
	}
}
