package automatedTests.tasks;

import automatedTests.model.OpencartData;
import automatedTests.userinterface.ListProducts;
import automatedTests.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static automatedTests.userinterface.ListProducts.*;

public class FilterSearch implements Task {

    private List<OpencartData> opencartData;

    public static FilterSearch theProducts(List<OpencartData> opencartData) {
        return Tasks.instrumented(FilterSearch.class, opencartData);
    }

    public FilterSearch (List<OpencartData> opencartData) {
        this.opencartData = opencartData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_CATALOG_SECTION),
                Click.on(SELECT_PRODUCTS_OPTION),
                Click.on(INPUT_NAME),
                Enter.theValue(opencartData.get(0).getProductName()).into(INPUT_NAME),
                Click.on(FILTER_BUTTON)
        );

        WaitTime.Time();
    }
}
