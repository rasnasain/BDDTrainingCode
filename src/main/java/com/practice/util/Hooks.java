package com.practice.util;

import com.practice.base.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase {

	@Before(order=0)
	public void beforeScenario() {
		System.out.println("Open browser and setup environment");

	}

	@Before(order=1)
	public void beforeScenarioExecuted() {
		System.out.println("*******************Before scenarion execution********************");

	}
	
	@Before("@login1")
	public void beforeSpecificScenario() {
		System.out.println("Before login1 scenario");

	}

	@After(order=0)
	public void afterScenarioExcecuted() {
		System.out.println("*******************Before scenarion execution********************");
	}

	@After(order=1)
	public void afterScenario() {
		tearDown();
	}

}
