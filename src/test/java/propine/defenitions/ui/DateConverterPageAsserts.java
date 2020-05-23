package propine.defenitions.ui;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import propine.steps.ui.DateConverterPageStates;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DateConverterPageAsserts {

    @Steps
    private DateConverterPageStates dateConverterPageStates;

    @Then("result date is (.*)")
    public void checkResultDate(String result) {
        assertThat("Generated date is incorrect", dateConverterPageStates.getResult(), equalTo(result));
    }

    @Then("date converter page header text is (.*)")
    public void checkHeaderText(String header) {
        assertThat("Header text is incorrect", dateConverterPageStates.getPageHeaderText(), equalTo(header));
    }

    @Then("converter page invitation text is (.*)")
    public void checkInvitationText(String text) {
        assertThat("Invitation text is incorrect", dateConverterPageStates.getPageInvitationText(), equalTo(text));
    }

    @Then("converter page input date field label is (.*)")
    public void checkInputDateFieldLabel(String text) {
        assertThat("Input date field label is incorrect", dateConverterPageStates.getInputDateFieldLabelText(), equalTo(text));
    }

    @Then("converter page result date field label is (.*)")
    public void checkResultDateFieldLabel(String text) {
        assertThat("Result date field label is incorrect", dateConverterPageStates.getResultLabelText(), equalTo(text));
    }

    @Then("converter page Submit button text is (.*)")
    public void checkSubmitButtonText(String text) {
        assertThat("Submit button text is incorrect", dateConverterPageStates.getSubmitButtonText(), equalTo(text));
    }

}
