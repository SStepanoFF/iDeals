package ideals;

import cucumber.api.java.Before;
import ideals.utils.WebDriverHelper;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.parsing.Parser;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Hooks {

    @Managed()
    private WebDriver driver;

    @Before("@ui")
    public void beforeUiTests() {
        WebDriverHelper.setDriverPath();
        getDriver().manage().window().maximize();
    }

    @Before("@api")
    public void initializeApiTests() {
        RestAssured.defaultParser = Parser.JSON;
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}
