package ideals.defenitions.ui;

import cucumber.api.java.en.Then;
import ideals.steps.ui.SignInPageStates;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SignInPageAsserts {

    @Steps
    private SignInPageStates signInPageStates;

    @Then("email input field contains (.*) text")
    public void checkEmailFieldText(String text) {
        assertThat("Email input field text is incorrect", signInPageStates.getEmailInputText(), equalTo(text));
    }

    @Then("email input field has (.*) background color")
    public void checkEmailFieldColor(String color) {
        assertThat("Email input field color is incorrect", signInPageStates.getEmailInputBorderColour(), equalTo(color));
    }

}
