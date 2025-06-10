package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D01FirstTest {
	@Test
	public void openInstaReel() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.instagram.com/reel/DAaQ1NOgoU_/?igsh=ejR0MjlneXF4ZWxt");
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
}
