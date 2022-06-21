package com.argoslowlevel.stepDefinitions;

import com.argoslowlevel.pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps {

    SearchPage searchPage = new SearchPage();

    @Given("^Users is on Argos Web Page$")
    public void users_is_on_Argos_Web_Page() {
        searchPage.getURL();
    }

    @When("^User enter the \"([^\"]*)\" in Search Box$")
    public void user_enter_the_in_Search_Box(String searchName) {
        searchPage.acceptCookies();
        searchPage.search(searchName);

    }

    @When("^User click on Search button$")
    public void user_click_on_Search_button() {
        searchPage.buttonClick();
    }

    @Then("^User must see nike products in search results and Verify it$")
    public void user_must_see_nike_products_in_search_results_and_Verify_it() {
        searchPage.searchHeader();

    }
}
