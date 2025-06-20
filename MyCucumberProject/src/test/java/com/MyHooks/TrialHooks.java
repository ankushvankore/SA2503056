package com.MyHooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TrialHooks {
	//@Before
	public void beforeScenario()
	{
		System.out.println("Before Hook");
	}
	//@After
	public void closeBrowser()
	{
		System.out.println("After hook");
	}
}
