package automatedTests.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListProducts extends PageObject {

    public static final Target SELECT_CATALOG_SECTION = Target.the("Click on catalog option")
            .located(By.id("menu-catalog"));

    public static final Target SELECT_PRODUCTS_OPTION = Target.the("Click on products option")
            .located(By.linkText("Products"));

    public static final Target INPUT_NAME = Target.the("Click on the Product Name field and Enter data")
            .located(By.id("input-name"));

    public static final Target FILTER_BUTTON = Target.the("Click on Button Filter")
            .located(By.id("button-filter"));

    public static final Target PRODUCT_LIST = Target.the("Check the list of products")
            .located(By.cssSelector("#form-product ~ div div:last-child"));
}