package ideals.defenitions.api;

import cucumber.api.java.en.Then;
import ideals.model.dto.response.CreateUserResponseDto;
import io.restassured.response.Response;

import static ideals.variables.SessionVariables.API_RESPONSE;
import static net.serenitybdd.core.Serenity.sessionVariableCalled;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ApiAsserts {

    @Then("API response status code is (.*)")
    public void checkStatusCode(int statusCode) {
        Response response = sessionVariableCalled(API_RESPONSE);
        response.then().statusCode(statusCode);
    }

    @Then("API create user response contains (.*) name and (.*) job")
    public void checkCreateUserResponse(String name, String job) {
        Response response = sessionVariableCalled(API_RESPONSE);
        CreateUserResponseDto responseDto = response.as(CreateUserResponseDto.class);
        assertThat("Create user response has incorrect name", responseDto.getName(), equalTo(name));
        assertThat("Create user response has incorrect job", responseDto.getJob(), equalTo(job));
    }

}
