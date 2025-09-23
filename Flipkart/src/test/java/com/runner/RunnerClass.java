package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.stepdefinition", 
features = "C:\\Users\\maniv\\Eclipse-New\\Flipkart\\src\\test\\resources\\FeatureFile\\FlipkartLogin.feature")
public class RunnerClass {

	
	
	
}
