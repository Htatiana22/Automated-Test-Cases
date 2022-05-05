package automatedTests.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YourstorePage extends PageObject {

    public static final Target SELECT_USER_PROFILE = Target.the("Click on user profile")
            .located(By.linkText("demo demo"));

    public static final Target YOUR_STORE_OPTION = Target.the("Select the option your store")
            .located(By.linkText("Your Store"));

    public static final Target INPUT_SEARCH_BOX = Target.the("Click on search box and enter text")
            .located(By.name("search"));

    public static final Target BUTTON_SEARCH = Target.the("Click on button search ")
            .located(By.cssSelector("#search button[type='button']"));

    public static final Target SELECT_PRODUCT = Target.the("Select the product of your choice")
            .located(By.linkText("MacBook Pro"));

    public static final Target INPUT_ENTER_UNITS = Target.the("Click on the input enter units")
            .located(By.id("input-quantity"));

    public static final Target BUTTON_ADD_TO_CART = Target.the("Click on button Add to Cart")
            .located(By.id("button-cart"));

    public static final Target BUTTON_ITEMS = Target.the("Click on button Items")
            .located(By.cssSelector("#cart > button"));

    public static final Target SELECT_VIEW_CART = Target.the("Select the option View Cart")
            .located(By.linkText("View Cart"));

    public static final Target BUTTON_CHECKOUT = Target.the("Select button Checkout")
            .located(By.linkText("Checkout"));

    public static final Target CAPTURE_TEXT = Target.the("Check scenario")
            .located(By.cssSelector("#checkout-cart .alert-danger"));

}
