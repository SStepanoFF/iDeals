package ideals;

import cucumber.api.java.Before;
import ideals.utils.WebDriverHelper;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Hooks {

    @Managed()
    private WebDriver driver;

    @Before("@ui")
    public void beforeRun() {
        WebDriverHelper.setDriverPath();
        getDriver().manage().window().maximize();
    }
}
