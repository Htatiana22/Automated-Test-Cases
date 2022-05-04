package automatedTests.questions;

import automatedTests.model.OpencartData;
import automatedTests.userinterface.OptionsOpencart;
import automatedTests.userinterface.YourstorePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class ResultYourstore implements Question <Boolean> {

    private List<OpencartData> opencartData;

    public ResultYourstore(List<OpencartData> opencartData) {
        this.opencartData = opencartData;
    }

    public static ResultYourstore thePage(List<OpencartData> opencartData) {
        return new ResultYourstore(opencartData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean UnsuccessfulTest;

        String VerifyPurchase = Text.of(YourstorePage.CAPTURE_TEXT).viewedBy(actor).asString();

        if (opencartData.get(0).getIncompleteTest().equals(VerifyPurchase)){
            UnsuccessfulTest = true;
        }else {
            UnsuccessfulTest = false;
        }

        return UnsuccessfulTest;
    }
}
