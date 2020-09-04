package ideals.defenitions.ui;

import cucumber.api.java.en.When;
import ideals.steps.ui.CommonAccountPageActions;
import net.thucydides.core.annotations.Steps;

public class CommonAccountPageDefinitions {

    @Steps
    private CommonAccountPageActions commonAccountPageActions;

    @When("click Sign Out header button")
    public void clickSignOut() {
        commonAccountPageActions.clickSignOutHeaderButton();
    }

    @When("trigger Sign Out endpoint")
    public void triggerSignOutEndpoint() {
        commonAccountPageActions.triggerSignOutEndpoint();
    }
}
