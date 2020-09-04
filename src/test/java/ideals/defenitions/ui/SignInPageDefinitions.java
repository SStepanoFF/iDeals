package ideals.defenitions.ui;

import cucumber.api.java.en.When;
import ideals.steps.ui.SignInPageActions;
import net.thucydides.core.annotations.Steps;

public class SignInPageDefinitions {

    @Steps
    SignInPageActions signInPageActions;

    @When("enter (.*) to the Email Address field")
    public void enterEmail(String email) {
        signInPageActions.enterEmail(email);
    }

    @When("enter (.*) to the Password field")
    public void enterPassword(String password) {
        signInPageActions.enterPassword(password);
    }

    @When("click Sign In button")
    public void clickSignInButton() {
        signInPageActions.clickSignInButton();
    }
}
