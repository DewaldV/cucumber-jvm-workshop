package com.dewaldv.steps;

import com.dewaldv.pages.GoogleSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {

    private GoogleSearchPage page = new GoogleSearchPage();

    @Given("^I am on the google homepage$")
    public void I_am_on_the_google_homepage() throws Throwable {
        page.navigateToHomePage();
    }

    @When("^I type in \"([^\"]*)\"$")
    public void I_type_in(String searchString) throws Throwable {
        throw new PendingException();
    }

    @And("^I click search$")
    public void I_click_search() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should see the top (\\d+) results$")
    public void I_should_see_the_top_results(int expectedNumberOfResults) throws Throwable {
        throw new PendingException();
    }
}
