package propine.steps.ui;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import propine.model.pages.DateConverterPage;

public class DateConverterPageStates extends ScenarioSteps {

    private DateConverterPage dateConverterPage;

    @Step
    public String getResult() {
        return dateConverterPage.getResultField().getText();
    }
}
