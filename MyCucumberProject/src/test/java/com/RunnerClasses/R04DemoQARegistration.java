package com.RunnerClasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F04DemoQARegistration.feature",
					glue = {"com.StepDef", "com.MyHooks"})
public class R04DemoQARegistration {

}
