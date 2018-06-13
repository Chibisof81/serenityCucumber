package serenityExample;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeTest;


public class BaseTest {
    @BeforeTest
    public static void beforeTest() {
        Configuration.browser = "chrome";
        WebDriverManager.chromedriver().setup();
    }
}
