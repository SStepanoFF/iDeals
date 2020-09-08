package ideals.definitions.api;

import cucumber.api.java.en.When;
import ideals.steps.api.ApiActions;
import io.cucumber.datatable.DataTable;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Map;

import static ideals.utils.PropertiesManager.getProperty;
import static ideals.variables.PropertiesVariables.API_TEST_URL;
import static ideals.variables.SessionVariables.API_RESPONSE;
import static ideals.variables.SessionVariables.UPDATED_DATE_TIME;
import static ideals.variables.SessionVariables.USER_ID;
import static io.restassured.RestAssured.given;

public class ApiDefinitions {

    private static final String BASE_URL = getProperty(API_TEST_URL);
    private static final String USER_OPERATIONS = "/api/users";

    @Steps
    private ApiActions apiActions;

    @When("create user with (.*) name and (.*) job")
    public void createUser(String name, String job) {
        Response response = given()
                .body(apiActions.createUserBody(name, job))
                .contentType(ContentType.JSON)
                .when()
                .post(BASE_URL + USER_OPERATIONS);
        String userId = response.path("id");
        Serenity.setSessionVariable(USER_ID).to(userId);
        Serenity.setSessionVariable(API_RESPONSE).to(response);
    }

    @When("get user with id=(.*)")
    public void getUser(String id) {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(BASE_URL + USER_OPERATIONS + "/" + id);
        Serenity.setSessionVariable(API_RESPONSE).to(response);
    }

    @When("PATCH update user with id=(.*) by data:")
    public void patchUpdateUser(String id, DataTable data) {
        Map<String, Object> dataMap = data.asMap(String.class, String.class);
        Response response = given()
                .body(dataMap)
                .contentType(ContentType.JSON)
                .when()
                .patch(BASE_URL + USER_OPERATIONS + "/" + id);
        Serenity.setSessionVariable(API_RESPONSE).to(response);
        Serenity.setSessionVariable(UPDATED_DATE_TIME).to(LocalDateTime.now(ZoneOffset.UTC));
    }

    @When("PUT update user with id=(.*) by data:")
    public void putUpdateUser(String id, DataTable data) {
        Map<String, Object> dataMap = data.asMap(String.class, String.class);
        Response response = given()
                .body(dataMap)
                .contentType(ContentType.JSON)
                .when()
                .put(BASE_URL + USER_OPERATIONS + "/" + id);
        Serenity.setSessionVariable(API_RESPONSE).to(response);
        Serenity.setSessionVariable(UPDATED_DATE_TIME).to(LocalDateTime.now(ZoneOffset.UTC));
    }

    @When("delete user with id=(.*)")
    public void deleteUser(String id) {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .delete(BASE_URL + USER_OPERATIONS + "/" + id);
        Serenity.setSessionVariable(API_RESPONSE).to(response);
    }

}
