package propine.steps.ui;

import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import propine.model.pages.DateConverterPage;

import static net.serenitybdd.core.environment.ConfiguredEnvironment.getEnvironmentVariables;
import static net.thucydides.core.ThucydidesSystemProperty.WEBDRIVER_BASE_URL;
import static propine.utils.PropertiesManager.getProperty;
import static propine.variables.PropertiesVariables.ENV_URL;

public class DateConverterPageActions extends ScenarioSteps {

    private DateConverterPage dateConverterPage;

    @Step
    public void openPage() {
        getEnvironmentVariables().setProperty(WEBDRIVER_BASE_URL.getPropertyName(), getProperty(ENV_URL));
        dateConverterPage.open();
    }

    @Step
    public void enterDate(String date) {
        dateConverterPage.getInputDateField().type(date);
    }

    @Step
    public void clickSubmitButton() {
        dateConverterPage.getSubmitButton().click();
        WaitUntil.angularRequestsHaveFinished();
    }
}
