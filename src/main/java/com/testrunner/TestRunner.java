package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Joy\\eclipse-workspace\\JavaSeleniumFramework\\src\\test\\resources\\feature"
		,glue = {"com.stepdefintion"}
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = true
		//,publish = true
		
		)
public class TestRunner {
 
}