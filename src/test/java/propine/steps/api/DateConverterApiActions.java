package propine.steps.api;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static io.restassured.RestAssured.given;
import static propine.utils.PropertiesManager.getProperty;
import static propine.variables.PropertiesVariables.ENV_URL;
import static propine.variables.SessionVariables.API_RESPONSE;

public class DateConverterApiActions extends ScenarioSteps {

    @Step
    public Response submitDate(String date) {
        Response response = given()
                .config(RestAssured.config()
                        .encoderConfig(EncoderConfig.encoderConfig()
                                .encodeContentTypeAs("x-www-form-urlencoded", ContentType.URLENC)))
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("date", date)
                .accept("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                .when()
                .post(getProperty(ENV_URL) + "submit");
        Serenity.setSessionVariable(API_RESPONSE).to(response);
        return response;
    }
}
