package propine.model.pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class DateConverterPage extends PageObject {

    @FindBy(className = "form-control")
    private WebElementFacade inputDateField;

    @FindBy(css = ".form-group label")
    private WebElementFacade inputDateFieldLabel;

    @FindBy(css = "*[type='submit']")
    private WebElementFacade submitButton;

    @FindBy(xpath = ".//*[.='Results']/following-sibling::div")
    private WebElementFacade resultField;

    @FindBy(css = ".col-md-6 h3")
    private WebElementFacade resultFieldLabel;

    @FindBy(css = ".jumbotron h1")
    private WebElementFacade pageHeader;

    @FindBy(css = ".jumbotron p")
    private WebElementFacade invitationText;
}
