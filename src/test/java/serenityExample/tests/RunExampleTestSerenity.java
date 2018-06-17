package serenityExample.tests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import serenityExample.BaseTest;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/en.feature",
        glue = "serenityExample")

public class RunExampleTestSerenity extends BaseTest {
}
