package automatedTests.tasks;

import automatedTests.model.OpencartData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import java.util.List;

import static automatedTests.userinterface.OptionsOpencart.*;

public class SelectOptions implements Task {

    private List<OpencartData> opencartData;

    public static SelectOptions toContinue(List<OpencartData> opencartData) {
        return Tasks.instrumented(SelectOptions.class, opencartData);
    }

    public SelectOptions (List<OpencartData> opencartData) {
        this.opencartData = opencartData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EXTENSIONS_OPTION),
                Click.on(MARKETPLACE_OPTION),
                Click.on(INPUT_FILTER_SEARCH),
                Enter.theValue(opencartData.get(0).getFilterSearch()).into(ENTER_DATA),
                Hit.the(Keys.ENTER).into(ENTER_DATA),
                Click.on(BUTTON_CATEGORIES),
                Click.on(SELECT_MARKETPLACE_OPTION),
                Click.on(FILTER_FREE_OPTION),
                Click.on(EXTENSION_PREVIEW),
                Scroll.to(DOWNLOAD_OPTION),
                Click.on(DOWNLOAD_OPTION)
        );

    }
}
