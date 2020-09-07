package ideals;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * It is a class for run cucumber with serenity
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {
        "pretty",
        "default_summary",
        "junit:build/test-results/cucumber/cucumber-result.xml"
//        "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
}, features = {"src/test/resources/features"}, glue = {"ideals"}, tags = "not @skip")
public class CucumberRunnerTest {
}
