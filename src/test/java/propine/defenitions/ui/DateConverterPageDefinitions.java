package propine.defenitions.ui;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import propine.steps.ui.DateConverterPageActions;

public class DateConverterPageDefinitions {

    @Steps
    private DateConverterPageActions dateConverterPageActions;

    @Given("open Date Converter page")
    public void openMainPage() {
        dateConverterPageActions.openPage();
    }

    @When("enter (.*) to the input field")
    public void enterDate(String date) {
        dateConverterPageActions.enterDate(date);
    }

    @When("click Submit button")
    public void clickBuyNow() {
        dateConverterPageActions.clickSubmitButton();
    }
}
