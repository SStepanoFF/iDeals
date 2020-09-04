package ideals.steps.ui;

import ideals.pages.SignInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SignInPageActions extends ScenarioSteps {

    private SignInPage signInPage;

    @Step
    public void enterEmail(String email) {
        signInPage.getEmailInput().type(email);
    }

    @Step
    public void enterPassword(String password) {
        signInPage.getPasswordInput().type(password);
    }

    @Step
    public void clickSignInButton() {
        signInPage.getSignInButton().click();
    }

}
