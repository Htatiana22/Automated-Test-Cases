package automatedTests.tasks;

import automatedTests.model.OpencartData;
import automatedTests.userinterface.PageOpencart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static automatedTests.userinterface.PageOpencart.*;

public class OpenCart implements Task {

    private List<OpencartData> opencartData;
    private PageOpencart pageOpencart;

    public static OpenCart thePage(List<OpencartData> opencartData) {
        return Tasks.instrumented(OpenCart.class, opencartData);
    }

    public OpenCart (List<OpencartData> opencartData) {
        this.opencartData = opencartData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pageOpencart),
                Click.on(INPUT_USERNAME),
                Enter.theValue(opencartData.get(0).getUserName()).into(ENTER_USERNAME),
                Click.on(INPUT_PASSWORD),
                Enter.theValue(opencartData.get(0).getPassword()).into(ENTER_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }
}
