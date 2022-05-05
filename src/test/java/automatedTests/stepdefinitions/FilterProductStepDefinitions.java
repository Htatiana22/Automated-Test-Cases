package automatedTests.stepdefinitions;

import automatedTests.model.OpencartData;
import automatedTests.questions.ResultFilter;
import automatedTests.tasks.FilterSearch;
import automatedTests.tasks.OpenCart;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class FilterProductStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^User selects the 'Products' option to search for available products$")
    public void userSelectsTheProductsOptionToSearchForAvailableProducts(List<OpencartData> opencartData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FilterSearch.theProducts(opencartData));
    }

    @Then("^User verify that the search result is consistent with the selected filter$")
    public void userVerifyThatTheSearchResultIsConsistentWithTheSelectedFilter(List<OpencartData> opencartData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ResultFilter.search(opencartData)));
    }
}
