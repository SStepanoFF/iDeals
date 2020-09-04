package ideals.steps.ui;

import ideals.pages.CommonLandingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CommonLandingPageStates extends ScenarioSteps {

    private CommonLandingPage commonLandingPage;

    @Step
    public boolean isSignInButtonVisible() {
        return commonLandingPage.getSignInButton().isVisible();
    }

}
