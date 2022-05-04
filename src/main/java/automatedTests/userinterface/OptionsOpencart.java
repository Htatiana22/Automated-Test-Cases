package automatedTests.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OptionsOpencart extends PageObject {

    public static final Target EXTENSIONS_OPTION = Target.the("Click on the extensions option")
            .located(By.id("menu-extension"));

    public static final Target MARKETPLACE_OPTION = Target.the("Click on the marketplace option")
            .located(By.linkText("Marketplace"));

    public static final Target INPUT_FILTER_SEARCH = Target.the("Click on the search bar")
            .located(By.id("extension-filter"));

    public static final Target ENTER_DATA = Target.the("Enter data to search")
            .located(By.name("filter_search"));

    public static final Target BUTTON_CATEGORIES = Target.the("Click on categories button")
            .located(By.cssSelector(".btn-default.dropdown-toggle"));

    public static final Target SELECT_MARKETPLACE_OPTION = Target.the("Click on the marketplace option")
            .located(By.linkText("Modules"));

    public static final Target FILTER_FREE_OPTION = Target.the("Click on filter free option")
            .located(By.linkText("Free"));

    public static final Target EXTENSION_PREVIEW = Target.the("Click on extension preview")
            .located(By.cssSelector(".extension-preview a"));

    public static final Target DOWNLOAD_OPTION = Target.the("Click on Download option")
            .located(By.linkText("Download"));

    public static final Target AVAILABLE_INSTALLS = Target.the("Check scenario")
            .located(By.cssSelector("#tab-download fieldset:nth-child(2) legend"));
}
