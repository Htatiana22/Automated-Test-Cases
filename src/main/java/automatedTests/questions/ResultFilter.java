package automatedTests.questions;

import automatedTests.model.OpencartData;
import automatedTests.userinterface.ListProducts;
import automatedTests.userinterface.OptionsOpencart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class ResultFilter implements Question <Boolean>{

    private List<OpencartData> opencartData;

    public ResultFilter(List<OpencartData> opencartData) {
        this.opencartData = opencartData;
    }
    public static ResultFilter search(List<OpencartData> opencartData) {
        return new ResultFilter(opencartData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean VerifyResult;

        String FilterResult = Text.of(ListProducts.PRODUCT_LIST).viewedBy(actor).asString();

        if (opencartData.get(0).getCheckFilteredProducts().equals(FilterResult)){
            VerifyResult = true;
        }else {
            VerifyResult = false;
        }

        return VerifyResult;
    }
}
