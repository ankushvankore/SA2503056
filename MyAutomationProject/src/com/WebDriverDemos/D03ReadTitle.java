package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D03ReadTitle {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://github.com/ankushvankore/SA2503056");

		String title = driver.getTitle();

		System.out.println("Title: " + title);

		//if (title.equals("GitHub - ankushvankore/SA2503056"))
		if(title.contains("SA2503056"))
			System.out.println("Test case passed");
		else
			System.out.println("Test case failed");

		driver.close();
	}

}
