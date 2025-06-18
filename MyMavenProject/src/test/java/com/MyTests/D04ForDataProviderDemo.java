package com.MyTests;

import org.testng.annotations.Test;

public class D04ForDataProviderDemo {
	
	@Test(dataProvider = "myData", dataProviderClass = com.MyTests.MyTrialClass.class)
	public void myTest(String fn, String ln) {
		System.out.println(fn);
		System.out.println(ln);
	}
}
