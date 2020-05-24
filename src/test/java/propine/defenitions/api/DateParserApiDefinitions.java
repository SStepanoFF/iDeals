package propine.defenitions.api;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import propine.steps.api.DateParserApiActions;

public class DateParserApiDefinitions {

    @Steps
    private DateParserApiActions dateParserApiActions;

    @When("submit API request with (.*) date")
    public void sendSubmitDate(String date) {
        dateParserApiActions.submitDate(date);
    }
}
