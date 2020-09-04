package ideals.steps.ui;

import ideals.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyAccountPageStates extends ScenarioSteps {

    private MyAccountPage myAccountPage;

    @Step
    public boolean isMyAccountPageOpened() {
        return myAccountPage.getGreetingInfo().isVisible();
    }

    @Step
    public String getGreetingText() {
        return myAccountPage.getGreetingInfo().getText();
    }

    @Step
    public String getCustomerName() {
        return myAccountPage.getAccountHeaderButton().getText();
    }
}
