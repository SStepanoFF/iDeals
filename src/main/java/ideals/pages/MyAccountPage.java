package ideals.pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


@Getter
public class MyAccountPage extends CommonAccountPage {

    @FindBy(className = "info-account")
    private WebElementFacade greetingInfo;

}
