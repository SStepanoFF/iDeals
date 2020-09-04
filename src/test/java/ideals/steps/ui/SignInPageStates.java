package ideals.steps.ui;

import ideals.pages.SignInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SignInPageStates extends ScenarioSteps {

    private SignInPage signInPage;

    @Step
    public String getEmailInputText() {
        return signInPage.getEmailInput().getText();
    }

    @Step
    public String getEmailInputBorderColour() {
        return signInPage.getEmailInput().getCssValue("color");
    }

}
