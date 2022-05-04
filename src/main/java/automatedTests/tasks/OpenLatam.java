package automatedTests.tasks;

import automatedTests.userinterface.LatamPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenLatam implements Task {

    private  LatamPage latamPage;

    public static OpenLatam thePage() {
        return Tasks.instrumented(OpenLatam.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(latamPage)
        );
    }
}


