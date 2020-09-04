package ideals.steps.ui;

import ideals.pages.CommonAccountPage;
import net.thucydides.core.annotations.Step;

import static ideals.utils.PropertiesManager.getProperty;
import static ideals.variables.PropertiesVariables.UI_TEST_URL;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CommonAccountPageActions {

    private static final String SIGN_OUT_ENDPOINT = getProperty(UI_TEST_URL) + "?mylogout";

    private CommonAccountPage commonAccountPage;

    @Step
    public void clickSignOutHeaderButton() {
        commonAccountPage.getSignOutHeaderButton().click();
    }

    @Step
    public void triggerSignOutEndpoint() {
        getDriver().get(SIGN_OUT_ENDPOINT);
    }
}
