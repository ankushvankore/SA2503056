package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM_Login_Logout {

	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//Login
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		//Logout
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
		driver.findElement(By.linkText("Logout")).click();*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Login with Admin

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		// Click on PIM

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();

		// Click on + Add button

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();

		// Add First name, middle name, last name

		driver.findElement(By.name("firstName")).sendKeys("Anjan");
		driver.findElement(By.name("middleName")).sendKeys("Kumar");
		driver.findElement(By.name("lastName")).sendKeys("Roy");

		// Click on create login detail

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form"
				+ "/div[1]/div[2]/div[2]/div/label/span")).click();

		// Enter user name/ password/ confirm password and click save button

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]"
				+ "/div[3]/div/div[1]/div/div[2]/input")).sendKeys("AnjanTest123");

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div"
				+ "[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys("Zxcv@786b");

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]"
				+ "/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("Zxcv@786b");

		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(@class,'bi-caret-down-fill')]"))).click();

		// Logout

		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout"))).click();


		Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys("AnjanTest123");
		driver.findElement(By.name("password")).sendKeys("Zxcv@786b");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

}
