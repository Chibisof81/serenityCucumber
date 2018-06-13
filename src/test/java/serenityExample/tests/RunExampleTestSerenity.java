package serenityExample.tests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import serenityExample.BaseTest;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:Features/en.feature",
        glue = {"test/java/serenityExample/steps/"}
)
public class RunExampleTestSerenity extends BaseTest {
}