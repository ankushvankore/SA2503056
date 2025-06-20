package com.RunnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F05AmazonLinks.feature",
					glue = "com.StepDef",
					tags = "@AllLinks",
					publish = true,
					plugin = {"json:Reports/Cucumber-json.json", 
								"junit:Reports/xmlReport.xml"})
public class R05AmazonLinks {
	/*
	 Execute Single Scenario:		tags = "@SmokeTest"
	 Execute Multiple Scenarios:	tags = "@SmokeTest or @DealsTest"
	 Skip Single Scenario:			tags = "not @DealsTest"
	 Skip Multiple Scenarios:		tags = "not @DealsTest and not @MobileTest"
	 */

}
