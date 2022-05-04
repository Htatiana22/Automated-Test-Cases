package automatedTests.tasks;

import automatedTests.model.CheckFlightsData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.Keys;

import java.util.List;

import static automatedTests.userinterface.LatamPage.*;

public class CheckFlights implements Task {

    private List<CheckFlightsData> checkFlightsData;

    public static CheckFlights onThePage(List<CheckFlightsData> checkFlightsData) {
        return Tasks.instrumented(CheckFlights.class, checkFlightsData);
    }

    public CheckFlights (List<CheckFlightsData> checkFlightsData) {
        this.checkFlightsData = checkFlightsData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_ROUNDTRIP_OPTION),
                Click.on(SELECT_ONEWAY),
                Click.on(INPUT_ENTER_ORIGIN),
                Enter.theValue(checkFlightsData.get(0).getEnterOrigin()).into(ENTER_ORIGIN),
                Hit.the(Keys.ENTER).into(SELECT_ORIGIN),
                Click.on(INPUT_ENTER_DESTINATION),
                Enter.theValue(checkFlightsData.get(0).getEnterDestination()).into(ENTER_DESTINATION),
                Hit.the(Keys.ENTER).into(SELECT_DESTINATION),
                Click.on(INPUT_DEPARTURE_DATE),
                Click.on(SELECT_DATE),
                Click.on(BUTTON_SEARCH)
        );
    }
}

