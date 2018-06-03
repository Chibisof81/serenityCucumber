package serenityExample.steps;


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

    @Дано("пользователь открывает сайт")
    public void пользовательОткрываетСайт() {
        searchPage.open();
    }

    @Когда("пользователь ввел запрос '(.*)'")
    public void пользовательВвелЗапрос(String text) {
        searchPage.setSearchInput(text);
    }

    @И("ползователь нажал поиск")
    public void ползовательНажалПоиск() {
        searchPage.setSearchButton();
    }

    @Тогда("на экране отображается результат")
    public void НаЭкранеОтображаетсяРезультат() {
        assertTrue(resultPageSerenity.setResultTable());
    }

}
