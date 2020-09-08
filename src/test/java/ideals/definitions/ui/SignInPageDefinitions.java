package ideals.definitions.ui;

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

    @When("enter (.*) email and (.*) password and sign in")
    public void signIn(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickSignInButton();
    }
}
