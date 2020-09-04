package ideals.defenitions.ui;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import ideals.steps.ui.LandingPageActions;
import net.thucydides.core.annotations.Steps;

public class LandingPageDefinitions {

    @Steps
    private LandingPageActions landingPageActions;

    @Given("open Landing page")
    public void openLandingPage() {
        landingPageActions.openPage();
    }

    @When("click Sign In header button")
    public void clickSignInHeaderButton() {
        landingPageActions.clickHeaderSignInButton();
    }

}
