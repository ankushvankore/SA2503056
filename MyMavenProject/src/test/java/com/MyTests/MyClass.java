package com.MyTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyClass {
	@Test
	public void myTest()
	{
		System.out.println("This is test");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
}
