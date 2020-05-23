package propine.utils;

import lombok.extern.slf4j.Slf4j;

import static propine.utils.OsManager.getOsType;

@Slf4j
public class WebDriverHelper {

    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String WEBDRIVER_GECKO_DRIVER = "webdriver.gecko.driver";

    public static void setDriverPath() {
        OsManager.OSType osType = getOsType();
        switch (System.getProperty("webdriver.driver").toLowerCase()) {
            case "firefox":
                setGeckoDriverPath(osType);
                break;
            case "chrome":
                setChromeDriverPath(osType);
                break;
            default:
                throw new RuntimeException("Unsupported browser");
        }
    }

    private static void setChromeDriverPath(OsManager.OSType osType) {
        log.info("Setting Chrome Driver path...");
        switch (osType) {
            case MAC:
                System.setProperty(WEBDRIVER_CHROME_DRIVER, "drivers/mac/chromedriver");
                break;
            case WINDOWS:
                System.setProperty(WEBDRIVER_CHROME_DRIVER, "drivers/windows/chromedriver.exe");
                break;
            case LINUX:
                System.setProperty(WEBDRIVER_CHROME_DRIVER, "drivers/linux/chromedriver");
                break;
        }
    }

    private static void setGeckoDriverPath(OsManager.OSType osType) {
        log.info("Setting FireFox Driver path...");
        switch (osType) {
            case MAC:
                System.setProperty(WEBDRIVER_GECKO_DRIVER, "drivers/mac/geckodriver");
                break;
            case WINDOWS:
                System.setProperty(WEBDRIVER_GECKO_DRIVER, "drivers/windows/geckodriver.exe");
                break;
            case LINUX:
                System.setProperty(WEBDRIVER_GECKO_DRIVER, "drivers/linux/geckodriver");
                break;
        }
    }
}
