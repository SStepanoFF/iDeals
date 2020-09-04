package ideals.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@Getter
public class CommonLandingPage extends CommonPage {

    @FindBy(className = "login")
    WebElementFacade signInButton;
}
