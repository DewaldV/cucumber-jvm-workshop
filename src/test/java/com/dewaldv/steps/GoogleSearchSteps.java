package com.dewaldv.steps;

import com.dewaldv.pages.GoogleSearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GoogleSearchSteps {

    private GoogleSearchPage page = new GoogleSearchPage();

    @Given("^I am on the google homepage$")
    public void I_am_on_the_google_homepage() throws Throwable {
        page.navigateToHomePage();
    }

    @When("^I type in \"([^\"]*)\"$")
    public void I_type_in(String searchString) throws Throwable {
        page.fillInSearchString(searchString);
    }

    @Then("^I should see the top (\\d+) results$")
    public void I_should_see_the_top_results(int expectedNumberOfResults) throws Throwable {
        List<WebElement> listOfResults = page.getListOfResults();
        assertThat(listOfResults.size(), equalTo(expectedNumberOfResults));
    }
}
