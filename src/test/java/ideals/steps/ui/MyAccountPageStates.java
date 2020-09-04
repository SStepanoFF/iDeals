package ideals.steps.ui;

import ideals.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyAccountPageStates extends ScenarioSteps {

    private MyAccountPage myAccountPage;

    @Step
    public boolean isGreetingInfoVisible() {
        return myAccountPage.getGreetingInfo().isVisible();
    }

    @Step
    public String getGreetingText() {
        return myAccountPage.getGreetingInfo().getText();
    }

    @Step
    public String getCustomerHeaderButtonText() {
        return myAccountPage.getAccountHeaderButton().getText();
    }

    @Step
    public boolean isCustomerHeaderButtonVisible() {
        return myAccountPage.getAccountHeaderButton().isCurrentlyVisible();
    }

    @Step
    public boolean isSignOutButtonVisible() {
        return myAccountPage.getSignOutHeaderButton().isVisible();
    }
}
