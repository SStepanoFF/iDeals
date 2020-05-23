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

}
