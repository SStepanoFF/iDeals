package ideals.defenitions.ui;

import cucumber.api.java.en.Then;
import ideals.steps.ui.MyAccountPageStates;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MyAccountPageAsserts {

    @Steps
    private MyAccountPageStates myAccountPageStates;

    @Then("My Account page is opened")
    public void checkMyAccountPageIsOpened() {
        assertThat("My Account page is not opened", myAccountPageStates.isMyAccountPageOpened());
    }

    @Then("Greeting text is (.*) on My Account page")
    public void checkGreetingText(String greetingText) {
        assertThat("My Account greeting text is incorrect", myAccountPageStates.getGreetingText(), is(greetingText));
    }

    @Then("customer name is (.*) on the header")
    public void checkCustomerNameOnTheHeader(String customerName) {
        assertThat("Incorrect customer name on the header", myAccountPageStates.getCustomerName(), is(customerName));
    }
}
