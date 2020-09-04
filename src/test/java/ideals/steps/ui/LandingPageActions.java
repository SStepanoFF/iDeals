package ideals.steps.ui;

import ideals.pages.CommonLandingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static ideals.utils.PropertiesManager.getProperty;
import static ideals.variables.PropertiesVariables.UI_TEST_URL;
import static net.serenitybdd.core.environment.ConfiguredEnvironment.getEnvironmentVariables;
import static net.thucydides.core.ThucydidesSystemProperty.WEBDRIVER_BASE_URL;

public class LandingPageActions extends ScenarioSteps {

    private CommonLandingPage commonLandingPage;

    @Step
    public void openPage() {
        getEnvironmentVariables().setProperty(WEBDRIVER_BASE_URL.getPropertyName(), getProperty(UI_TEST_URL));
        commonLandingPage.open();
    }

    @Step
    public void clickHeaderSignInButton() {
        commonLandingPage.getSignInButton().click();
    }

}
