package ideals.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@Getter
public class CommonAccountPage extends CommonPage {

    @FindBy(className = "account")
    WebElementFacade accountHeaderButton;

    @FindBy(className = "logout")
    WebElementFacade signOutHeaderButton;
}
