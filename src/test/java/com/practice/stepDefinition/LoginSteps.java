package com.practice.stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.practice.base.TestBase;
import com.practice.pages.DashboardPage;
import com.practice.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends TestBase {
	LoginPage lp = new LoginPage();

	
	@Given("^User open OHRM application with Admin role$")
	public void login_OHRM_application() throws IOException {
		initialization();
	}

	@When("^User enter valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_valid_user_id_and_password(String userName, String password) {
		lp.login(userName, password);
	}

	// First way of extracting data using list
//	@When("^User enter valid username UserName and Password $")
//	public void user_login_with_valid_user_id_and_password(DataTable userCredentials) {
//		List<List<String>> data = userCredentials.asLists();
//	    lp.login(data.get(0).get(0), data.get(0).get(1));
//	}

	// using map
	@When("^User enter valid username UserName and Password$")
	public void user_login_with_valid_user_id_and_password(DataTable userCredentials) {
		
		List<Map<String, String>> data = userCredentials.asMaps();
		for(Map<String, String> values : data) {
			lp.login(values.get("UserName"), values.get("Password"));
		}
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() {
		System.out.println("in step");
	}

	@Then("^User logged in successfully$")
	public void validate_user_logged_in_successfully() {
		DashboardPage dp = new DashboardPage();
		dp.timeAtWork();
	}
	
	@Given("^User is on ORHM Dashboard page$")
	public void user_is_on_orhm_dashboard_page() {
		DashboardPage dp = new DashboardPage();
		dp.timeAtWork();
	}

	@When("^User click on Admin$")
	public void user_click_on_admin() {
		 System.out.println("Inside in a step definition");
	}

	@When("^User is able to see all available users list$")
	public void user_is_able_to_see_all_available_users_list() {
		 System.out.println("Inside in a step definition");
	}

}
