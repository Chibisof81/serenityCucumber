package serenityExample;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;


public class BaseTest {

    @BeforeClass
    public static void beforeTest() {
        Configuration.browser = "chrome";
        WebDriverManager.chromedriver().setup();
    }
}
