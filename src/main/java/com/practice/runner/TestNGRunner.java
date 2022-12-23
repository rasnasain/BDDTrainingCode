package com.practice.runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "",
		features="src/test/resources/features/Login.feature",
		glue="com/practice/stepDefinition",
		monochrome=true,
		plugin = {"pretty", "html:target/cucumber-reports/cucmber.html"}	
		)
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
