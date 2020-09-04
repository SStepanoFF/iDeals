package ideals.steps.ui;

import ideals.pages.LandingPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LandingPageStates extends ScenarioSteps {

    @Step
    public boolean isLandingPageOpened() {
        return pages().isCurrentPageAt(LandingPage.class);
    }

}
