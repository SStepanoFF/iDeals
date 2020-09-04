package ideals.pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class SignInPage extends CommonLandingPage {

    @FindBy(id = "email")
    private WebElementFacade emailInput;

    @FindBy(id = "passwd")
    private WebElementFacade passwordInput;

    @FindBy(id = "SubmitLogin")
    private WebElementFacade signInButton;

}
