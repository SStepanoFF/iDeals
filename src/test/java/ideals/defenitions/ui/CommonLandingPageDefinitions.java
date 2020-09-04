package ideals.defenitions.ui;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import ideals.steps.ui.CommonLandingPageActions;
import net.thucydides.core.annotations.Steps;

public class CommonLandingPageDefinitions {

    @Steps
    private CommonLandingPageActions commonLandingPageActions;

    @Given("open Landing page")
    public void openLandingPage() {
        commonLandingPageActions.openPage();
    }

    @When("click Sign In header button")
    public void clickSignInHeaderButton() {
        commonLandingPageActions.clickHeaderSignInButton();
    }

}
