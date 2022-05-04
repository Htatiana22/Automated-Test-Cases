package automatedTests.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.latamairlines.com/co/es")

public class LatamPage extends PageObject {

        public static final Target SELECT_ROUNDTRIP_OPTION = Target.the("Click on the one way option")
                .located(By.id("btnTripTypeCTA"));

        public static final Target SELECT_ONEWAY = Target.the("Click on the one way option")
                .located(By.id("btnTripType0"));

        public static final Target INPUT_ENTER_ORIGIN = Target.the("Click on the field enter the origin")
                .located(By.id("txtInputOrigin_field"));

        public static final Target ENTER_ORIGIN = Target.the("Enter city of origin")
                .located(By.id("txtInputOrigin_field"));

        public static final Target SELECT_ORIGIN = Target.the("Select origin ")
                .located(By.id("btnItemAutoComplete_1"));

        public static final Target INPUT_ENTER_DESTINATION = Target.the("Click on the field enter destination")
                .located(By.id("txtInputDestination_field"));

        public static final Target ENTER_DESTINATION = Target.the("Enter destination city")
                .located(By.id("txtInputDestination_field"));

        public static final Target SELECT_DESTINATION = Target.the("Select destination")
                .located(By.id("btnItemAutoComplete_0"));

        public static final Target INPUT_DEPARTURE_DATE = Target.the("Click on the date field one way")
                .located(By.id("departureDate"));

        public static final Target SELECT_DATE = Target.the("Select date")
                .located(By.xpath("//td[@aria-label='viernes, 27 de mayo de 2022']"));

        public static final Target BUTTON_SEARCH = Target.the("Click on the search button")
                .located(By.id("btnSearchCTA"));

        public static final Target VUELO_DE_IDA = Target.the("Verify result")
                .located(By.cssSelector("#titleSelectFlightDesktop .route-title"));

}
