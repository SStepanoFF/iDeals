package propine.defenitions.api;

import cucumber.api.java.en.Then;
import io.restassured.response.Response;

import static net.serenitybdd.core.Serenity.sessionVariableCalled;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static propine.variables.SessionVariables.API_RESPONSE;

public class DateConverterApiAsserts {

    @Then("API response status code is (.*)")
    public void checkStatusCode(int statusCode) {
        Response response = sessionVariableCalled(API_RESPONSE);
        response.then().statusCode(statusCode);
    }

    @Then("API result date is (.*)")
    public void checkResultDate(String result) {
        Response response = sessionVariableCalled(API_RESPONSE);
        assertThat("Generated date is incorrect",
                response.body().htmlPath().getString("**.findAll { it.@class == 'col-md-6'}[1].div").trim(),
                equalTo(result));
    }
}
