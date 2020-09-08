package ideals.definitions.ui;

import cucumber.api.java.en.Then;
import ideals.steps.ui.CommonLandingPageStates;
import net.thucydides.core.annotations.Steps;

public class CommonLandingPageAsserts {

    @Steps
    private CommonLandingPageStates commonLandingPageStates;

    @Then("Sign In button is present on the header")
    public void clickSignInHeaderButton() {
        commonLandingPageStates.isSignInButtonVisible();
    }

}
