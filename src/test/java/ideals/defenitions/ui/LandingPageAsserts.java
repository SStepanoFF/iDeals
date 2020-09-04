package ideals.defenitions.ui;

import cucumber.api.java.en.Then;
import ideals.steps.ui.LandingPageStates;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;

public class LandingPageAsserts {

    @Steps
    private LandingPageStates landingPageStates;

    @Then("Landing page is opened")
    public void checkLandingPageOpened() {
        assertThat("Landing page is not opened", landingPageStates.isLandingPageOpened());
    }

}
