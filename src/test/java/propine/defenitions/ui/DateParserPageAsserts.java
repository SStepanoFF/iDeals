package propine.defenitions.ui;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import propine.steps.ui.DateParserPageStates;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DateParserPageAsserts {

    @Steps
    private DateParserPageStates dateParserPageStates;

    @Then("result date is (.*)")
    public void checkResultDate(String result) {
        assertThat("Generated date is incorrect", dateParserPageStates.getResult(), equalTo(result));
    }

    @Then("date parser page header text is (.*)")
    public void checkHeaderText(String header) {
        assertThat("Header text is incorrect", dateParserPageStates.getPageHeaderText(), equalTo(header));
    }

    @Then("parser page invitation text is (.*)")
    public void checkInvitationText(String text) {
        assertThat("Invitation text is incorrect", dateParserPageStates.getPageInvitationText(), equalTo(text));
    }

    @Then("parser page input date field label is (.*)")
    public void checkInputDateFieldLabel(String text) {
        assertThat("Input date field label is incorrect", dateParserPageStates.getInputDateFieldLabelText(), equalTo(text));
    }

    @Then("parser page result date field label is (.*)")
    public void checkResultDateFieldLabel(String text) {
        assertThat("Result date field label is incorrect", dateParserPageStates.getResultLabelText(), equalTo(text));
    }

    @Then("parser page Input date field placeholder text is (.*)")
    public void checkInputFieldPlaceholder(String text) {
        assertThat("Input date field placeholder text is incorrect", dateParserPageStates.getInputDateFieldPlaceholderText(), equalTo(text));
    }

    @Then("parser page Input date field contains (.*) text")
    public void checkInputFieldText(String text) {
        assertThat("Input date field text is incorrect", dateParserPageStates.getInputDateFieldText(), equalTo(text));
    }

    @Then("parser page Submit button text is (.*)")
    public void checkSubmitButtonText(String text) {
        assertThat("Submit button text is incorrect", dateParserPageStates.getSubmitButtonText(), equalTo(text));
    }

}
