package propine.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class PageUtils {

    private static final String IFRAME_TAG = "iframe";

    public static void switchToFrame(WebElement elementFrame) {
        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(elementFrame));
    }

    public static void switchToIFrame() {
//        WebElement iFrameElement = getDriver().findElement(By.cssSelector(".page-container"));
        WebElement iFrameElement = getDriver().findElement(By.tagName(IFRAME_TAG));
        switchToFrame(iFrameElement);
    }
}
