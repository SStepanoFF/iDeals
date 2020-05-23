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

    @Step
    public String getPageHeaderText() {
        return dateConverterPage.getPageHeader().getText();
    }

    @Step
    public String getPageInvitationText() {
        return dateConverterPage.getInvitationText().getText();
    }

    @Step
    public String getInputDateFieldLabelText() {
        return dateConverterPage.getInputDateFieldLabel().getText();
    }

    @Step
    public String getResultLabelText() {
        return dateConverterPage.getResultFieldLabel().getText();
    }

    @Step
    public String getInputDateFieldPlaceholderText() {
        return dateConverterPage.getInputDateField().getAttribute("placeholder");
    }
}
