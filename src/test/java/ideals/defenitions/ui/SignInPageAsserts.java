package ideals.defenitions.ui;

import cucumber.api.java.en.Then;
import ideals.steps.ui.SignInPageStates;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class SignInPageAsserts {

    @Steps
    private SignInPageStates signInPageStates;

    @Then("Sign In page is opened")
    public void checkSignInPageOpened() {
        assertThat("Sign In page is not opened", signInPageStates.isEmailInputPresent());
    }

    @Then("Error message is displayed and contains (.*) text")
    public void checkErrorMessage(String error) {
        assertThat("Error message is not present", signInPageStates.isErrorMessagePresent());
        assertThat("Error message is incorrect", signInPageStates.getErrorMessageText(), containsString(error));
    }

    @Then("email input field contains (.*) text")
    public void checkEmailFieldText(String text) {
        assertThat("Email input field text is incorrect", signInPageStates.getEmailInputText(), equalTo(text));
    }

    @Then("email input field has (.*) background color")
    public void checkEmailFieldColor(String color) {
        assertThat("Email input field color is incorrect", signInPageStates.getEmailInputBorderColour(),
                containsString(FieldColor.valueOf(color.toUpperCase()).getRgbValue()));
    }

    @Getter
    @AllArgsConstructor
    public enum FieldColor {
        RED("241, 51, 64"),
        GREEN("53, 179, 63");

        private String rgbValue;
    }

}
