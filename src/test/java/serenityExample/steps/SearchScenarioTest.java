package serenityExample.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import serenityExample.pages.ExamplePageSerenity;
import serenityExample.pages.ResultPageSerenity;

import static org.junit.Assert.assertTrue;

public class SearchScenarioTest {
    ExamplePageSerenity searchPage;
    ResultPageSerenity resultPageSerenity;

//    @Дано("пользователь открывает сайт")
//    public void пользовательОткрываетСайт() throws Exception{
//        searchPage.open();
//    }
//
//    @Когда("пользователь ввел запрос '(.*)'")
//    public void пользовательВвелЗапрос(String text) throws Exception {
//        searchPage.setSearchInput(text);
//    }
//
//    @И("ползователь нажал поиск")
//    public void ползовательНажалПоиск() throws Exception {
//        searchPage.setSearchButton();
//    }
//
//    @Тогда("^на экране отображается результат$")
//    public void НаЭкранеОтображаетсяРезультат() throws Exception {
//        assertTrue(resultPageSerenity.setResultTable());
//    }

    @Given("user open site")
    public void userOpenSite() {
        searchPage.open();
    }

    @When("user write '(.*)'")
    public void userWrite(String text)  {
        searchPage.setSearchInput(text);
    }

    @And("push the button")
    public void pushTheButton() {
        searchPage.setSearchButton();
    }

    @Then("search displayed")
    public void searchDisplayed() {
        assertTrue(resultPageSerenity.checkResultsVisible());
    }


}
