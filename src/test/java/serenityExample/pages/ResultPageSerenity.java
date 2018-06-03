package serenityExample.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;


public class ResultPageSerenity extends PageObject {

    @FindBy(css = ".b-content-center > .b-query:nth-of-type(1)")
    WebElementFacade result;

    public boolean setResultTable() {
        result.waitUntilVisible();
        return result.isVisible();
    }
}
