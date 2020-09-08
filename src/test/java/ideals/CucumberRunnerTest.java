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
        "html:build/test-results/cucumber-reports",
        "junit:build/test-results/cucumber-reports/cucumber-result.xml",
        "json:build/test-results/cucumber-reports/cucumber.json",
        "junit:build/test-results/junit/junit.xml",
}, monochrome = true, features = {"src/test/resources/features"}, glue = {"ideals"}, tags = "not @skip")
public class CucumberRunnerTest {
}
