package propine.defenitions.ui;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import propine.steps.ui.DateParserPageActions;

public class DateParserPageDefinitions {

    @Steps
    private DateParserPageActions dateParserPageActions;

    @Given("open Date Parser page")
    public void openMainPage() {
        dateParserPageActions.openPage();
    }

    @When("enter (.*) to the input field")
    public void enterDate(String date) {
        dateParserPageActions.enterDate(date);
    }

    @When("click Submit button")
    public void clickBuyNow() {
        dateParserPageActions.clickSubmitButton();
    }
}
