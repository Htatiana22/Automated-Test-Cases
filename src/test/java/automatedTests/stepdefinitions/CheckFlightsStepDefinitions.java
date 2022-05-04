package automatedTests.stepdefinitions;

import automatedTests.model.CheckFlightsData;
import automatedTests.questions.ResultFlights;
import automatedTests.tasks.CheckFlights;
import automatedTests.tasks.OpenLatam;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class CheckFlightsStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^User enters to the Latam's Airlines page$")
    public void userEntersToTheLatamSAirlinesPage() {
        OnStage.theActorCalled("Herika").wasAbleTo(OpenLatam.thePage());
    }

    @When("^User selects the option 'one way' enters the data to continue$")
    public void userSelectsTheOptionOneWayEntersTheDataToContinue(List<CheckFlightsData> checkFlightsData) {
        OnStage.theActorInTheSpotlight().attemptsTo(CheckFlights.onThePage(checkFlightsData));
    }

    @Then("^User checks the result of the available flights according to the query made$")
    public void userChecksTheResultOfTheAvailableFlightsAccordingToTheQueryMade(List<CheckFlightsData> checkFlightsData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ResultFlights.toEnd(checkFlightsData)));
    }
}
