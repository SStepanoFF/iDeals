package propine.defenitions.api;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import propine.steps.api.DateConverterApiActions;

public class DateConverterApiDefinitions {

    @Steps
    private DateConverterApiActions dateConverterApiActions;

    @When("submit API request with (.*) date")
    public void sendSubmitDate(String date) {
        dateConverterApiActions.submitDate(date);
    }
}
