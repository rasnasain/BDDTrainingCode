package com.practice.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSteps {


	@Given("^I open amazon application$")
    public void i_open_amazon_application() throws Throwable {
		System.out.println("Inside step definition");
    }

    @When("^I go to categories section$")
    public void i_go_to_categories_section() throws Throwable {
    	System.out.println("Inside step definition");
    }

    @Then("^I should be able to select books categories from categories$")
    public void i_should_be_able_to_select_books_categories_from_categories() throws Throwable {
    	System.out.println("Inside step definition");
    }

    @Then("^I expect the top picks of books should be displayed$")
    public void i_expect_the_top_picks_of_books_should_be_displayed() throws Throwable {
    	System.out.println("Inside step definition");
    }

    @And("^I click on search$")
    public void i_click_on_search() throws Throwable {
    	System.out.println("Inside step definition");
    }

    @But("^Not any other products from any other category$")
    public void not_any_other_products_from_any_other_category() throws Throwable {
    	System.out.println("Inside step definition");
    }

}
