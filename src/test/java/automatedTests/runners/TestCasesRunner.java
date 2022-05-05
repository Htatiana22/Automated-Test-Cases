package automatedTests.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/testScenarios.feature",
//@CucumberOptions(features = "src/test/resources/features/checkFlights.feature",
        tags = "@UserStory",
        //tags = "@Scenario1",
        glue = "automatedTests.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class TestCasesRunner {
}
