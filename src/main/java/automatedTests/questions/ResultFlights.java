package automatedTests.questions;

import automatedTests.model.CheckFlightsData;
import automatedTests.userinterface.LatamPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class ResultFlights implements Question <Boolean> {

    private List<CheckFlightsData> checkFlightsData;

    public ResultFlights (List<CheckFlightsData> checkFlightsData) {
        this.checkFlightsData = checkFlightsData;
    }

    public static ResultFlights toEnd(List<CheckFlightsData> checkFlightsData) {
        return new ResultFlights(checkFlightsData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean VerifyResult;

        String FinalResult = Text.of(LatamPage.VUELO_DE_IDA).viewedBy(actor).asString();

        if (checkFlightsData.get(0).getTestFinished().equals(FinalResult)){
            VerifyResult = true;
        }else {
            VerifyResult = false;
        }

        return VerifyResult;
    }
}
