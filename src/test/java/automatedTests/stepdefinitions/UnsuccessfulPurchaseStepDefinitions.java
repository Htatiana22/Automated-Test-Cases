package automatedTests.stepdefinitions;

import automatedTests.model.OpencartData;
import automatedTests.questions.ResultOpencart;
import automatedTests.questions.ResultYourstore;
import automatedTests.tasks.OpenCart;
import automatedTests.tasks.SearchProducts;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UnsuccessfulPurchaseStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^User selects the 'Yourstore' module to buy a laptop$")
    public void userSelectsTheYourstoreModuleToBuyALaptop(List<OpencartData> opencartData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchProducts.yourStore(opencartData));
    }

    @Then("^User checks if the product was added to the shopping cart to finalize the purchase$")
    public void userChecksIfTheProductWasAddedToTheShoppingCartToFinalizeThePurchase(List<OpencartData> opencartData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ResultYourstore.thePage(opencartData)));
    }
}
