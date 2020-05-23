package propine;

import cucumber.api.java.Before;
import propine.utils.WebDriverHelper;

public class Hooks {

    @Before("@ui")
    public void beforeRun() {
        WebDriverHelper.setDriverPath();
    }
}
