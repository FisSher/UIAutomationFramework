package StepDefs;

import Paginas.GoogleSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepdefs {
    GoogleSearchPage googleSearch = new GoogleSearchPage();

    @Given("a web browser is at the google search page")
    public void aWebBrowserIsAtTheGoogleSearchPage() {
    googleSearch.navigateToGoogle();
    }

    @When("a user types {string} in the search bar")
    public void aUserTypesInTheSearchBar(String searchCriteria) {
        googleSearch.enterSearchCriteria(searchCriteria);
    }

    @And("clicks on the search button")
    public void clicksOnTheSearchButton() {
        googleSearch.clickOnSearchButton();
    }

    @Then("links related to {string} appears on the results page")
    public void linksRelatedToAppearsOnTheResultsPage(String arg0) {
        //No logic inside here yet
    }



}
