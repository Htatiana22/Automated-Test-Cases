package automatedTests.tasks;

import automatedTests.model.OpencartData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static automatedTests.userinterface.YourstorePage.*;

public class SearchProducts implements Task {

    private List<OpencartData> opencartData;

    public static SearchProducts yourStore(List<OpencartData> opencartData) {
        return Tasks.instrumented(SearchProducts.class, opencartData);
    }

    public SearchProducts (List<OpencartData> opencartData) {
        this.opencartData = opencartData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_USER_PROFILE),
                Click.on(YOUR_STORE_OPTION)
        );

        for(String winHandle : Serenity.getWebdriverManager().getWebdriver().getWindowHandles()){
            Serenity.getWebdriverManager().getWebdriver().switchTo().window(winHandle);
        }

        actor.attemptsTo(
                Click.on(INPUT_SEARCH_BOX),
                Enter.theValue(opencartData.get(0).getSearchBox()).into(INPUT_SEARCH_BOX),
                Click.on(BUTTON_SEARCH),
                Click.on(SELECT_PRODUCT),
                Click.on(INPUT_ENTER_UNITS),
                Enter.theValue(opencartData.get(0).getWriteNumber()).into(INPUT_ENTER_UNITS),
                Click.on(BUTTON_ADD_TO_CART),
                Click.on(BUTTON_ITEMS),
                Click.on(SELECT_VIEW_CART),
                Scroll.to(BUTTON_CHECKOUT),
                Click.on(BUTTON_CHECKOUT)
        );

    }
}
