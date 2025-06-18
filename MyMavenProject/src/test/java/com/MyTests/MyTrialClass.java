package com.MyTests;

import org.testng.annotations.DataProvider;

public class MyTrialClass {

	@DataProvider
	public String[][] myData()
	{
		String[][] data = new String[][] {{"Ankush", "Vankore"}, 
										{"Deeksha", "Bheemireddy"},
										{"Anjan", "Roy"}};
										
		return data;
	}
	
}
