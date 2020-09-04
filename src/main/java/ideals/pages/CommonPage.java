package ideals.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

/**
 * CommonPage.class contains common elements for all pages
 */
@Getter
public class CommonPage extends PageObject {

    @FindBy(id = "contact-link")
    WebElementFacade contactUsButton;

    @FindBy(className = "shop-phone")
    WebElementFacade shopPhoneButton;

}
