package propine.steps.ui;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import propine.model.pages.DateParserPage;

public class DateParserPageStates extends ScenarioSteps {

    private DateParserPage dateParserPage;

    @Step
    public String getResult() {
        return dateParserPage.getResultField().getText();
    }

    @Step
    public String getPageHeaderText() {
        return dateParserPage.getPageHeader().getText();
    }

    @Step
    public String getPageInvitationText() {
        return dateParserPage.getInvitationText().getText();
    }

    @Step
    public String getInputDateFieldLabelText() {
        return dateParserPage.getInputDateFieldLabel().getText();
    }

    @Step
    public String getResultLabelText() {
        return dateParserPage.getResultFieldLabel().getText();
    }

    @Step
    public String getInputDateFieldPlaceholderText() {
        return dateParserPage.getInputDateField().getAttribute("placeholder");
    }

    @Step
    public String getInputDateFieldText() {
        return dateParserPage.getInputDateField().getTextValue();
    }

    @Step
    public String getSubmitButtonText() {
        return dateParserPage.getSubmitButton().getValue();
    }
}
