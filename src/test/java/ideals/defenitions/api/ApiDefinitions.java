package ideals.defenitions.api;

import cucumber.api.java.en.When;
import ideals.steps.api.ApiActions;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

import static ideals.utils.PropertiesManager.getProperty;
import static ideals.variables.PropertiesVariables.API_TEST_URL;
import static ideals.variables.SessionVariables.API_RESPONSE;
import static io.restassured.RestAssured.given;

public class ApiDefinitions {

    private static final String BASE_URL = getProperty(API_TEST_URL);
    private static final String CREATE_USER = "/api/users";

    @Steps
    private ApiActions apiActions;

    @When("create user with (.*) name and (.*) job")
    public void createUser(String name, String job) {
        Response response = given()
                .body(apiActions.createUserBody(name, job))
                .contentType(ContentType.JSON)
                .when()
                .post(BASE_URL + CREATE_USER);
        Serenity.setSessionVariable(API_RESPONSE).to(response);
    }

}
