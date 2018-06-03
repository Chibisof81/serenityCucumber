package serenityExample.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.sputnik.ru")
public class ExamplePageSerenity extends PageObject {

    @FindBy(css = "input")
    WebElementFacade searchInput;

    @FindBy(css = "button")
    WebElementFacade searchButton;

    public void setSearchInput (String text){
        searchInput.type(text);
    }

    public void setSearchButton(){
        searchButton.click();
    }

}
