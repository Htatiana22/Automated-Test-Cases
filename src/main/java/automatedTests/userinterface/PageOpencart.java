package automatedTests.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.opencart.com/admin/index.php?route=common/dashboard")

public class PageOpencart extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Click on the username field")
            .located(By.id("input-username"));

    public static final Target ENTER_USERNAME = Target.the("Enter username")
            .located(By.id("input-username"));

    public static final Target INPUT_PASSWORD = Target.the("Click on the password field")
            .located(By.id("input-password"));

    public static final Target ENTER_PASSWORD = Target.the("Enter password")
            .located(By.id("input-password"));

    public static final Target BUTTON_LOGIN = Target.the("Enter password")
            .located(By.xpath("//button[@type='submit']"));
}
