package automatedTests.questions;

import automatedTests.model.OpencartData;
import automatedTests.userinterface.OptionsOpencart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class ResultOpencart implements Question <Boolean> {

    private List<OpencartData> opencartData;

    public ResultOpencart(List<OpencartData> opencartData) {
        this.opencartData = opencartData;
    }

    public static ResultOpencart toEnd(List<OpencartData> opencartData) {
        return new ResultOpencart(opencartData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean Result;

        String CheckEndResult = Text.of(OptionsOpencart.AVAILABLE_INSTALLS).viewedBy(actor).asString();

        if (opencartData.get(0).getCorrectScenario().equals(CheckEndResult)){
            Result = true;
        }else {
            Result = false;
        }

        return Result;
    }
}
