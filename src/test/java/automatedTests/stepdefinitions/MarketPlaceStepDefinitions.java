package automatedTests.stepdefinitions;

import automatedTests.model.OpencartData;
import automatedTests.questions.ResultOpencart;
import automatedTests.tasks.OpenCart;
import automatedTests.tasks.SelectOptions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class MarketPlaceStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^User registered enters the opencart page$")
    public void userRegisteredEntersTheOpencartPage(List<OpencartData> opencartData) {
        OnStage.theActorCalled("Herika").wasAbleTo(OpenCart.thePage(opencartData));
    }

    @When("^User selects the 'Marketplace' section to download a free template$")
    public void userSelectsTheMarketplaceSectionToDownloadAFreeTemplate(List<OpencartData> opencartData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOptions.toContinue(opencartData));
    }

    @Then("^User verifies the results obtained to download the template$")
    public void userVerifiesTheResultsObtainedToDownloadTheTemplate(List<OpencartData> opencartData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ResultOpencart.toEnd(opencartData)));
    }
}
