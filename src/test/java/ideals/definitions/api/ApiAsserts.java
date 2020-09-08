package ideals.definitions.api;

import cucumber.api.java.en.Then;
import ideals.model.dto.response.CreateUserResponseDto;
import ideals.model.dto.response.GetUserResponseDto;
import io.cucumber.datatable.DataTable;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import org.exparity.hamcrest.date.LocalDateTimeMatchers;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Map;

import static ideals.variables.SessionVariables.API_RESPONSE;
import static ideals.variables.SessionVariables.UPDATED_DATE_TIME;
import static net.serenitybdd.core.Serenity.sessionVariableCalled;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

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

    @Then("API get user response has parameters:")
    public void checkGetUserResponse(DataTable params) {
        Response response = sessionVariableCalled(API_RESPONSE);
        GetUserResponseDto responseDto = response.as(GetUserResponseDto.class);
        Map<String, Object> expectedFields = params.asMap(String.class, String.class);
        assertThat("GET user response has incorrect 'ID' field", responseDto.getData().getId(), equalTo(expectedFields.get("id")));
        assertThat("GET user response has incorrect 'email' field", responseDto.getData().getEmail(), equalTo(expectedFields.get("email")));
        assertThat("GET user response has incorrect 'firstName' field", responseDto.getData().getFirstName(), equalTo(expectedFields.get("firstName")));
        assertThat("GET user response has incorrect 'lastName' field", responseDto.getData().getLastName(), equalTo(expectedFields.get("lastName")));
        assertThat("GET user response has incorrect 'avatar' field", responseDto.getData().getAvatar(), equalTo(expectedFields.get("avatar")));
        assertThat("GET user response has incorrect 'company' field", responseDto.getAd().getCompany(), equalTo(expectedFields.get("company")));
        assertThat("GET user response has incorrect 'url' field", responseDto.getAd().getUrl(), equalTo(expectedFields.get("url")));
        assertThat("GET user response has incorrect 'text' field", responseDto.getAd().getText(), equalTo(expectedFields.get("text")));

    }

    @Then("API response contains entries:")
    public void checkThatResponseContainsEntries(DataTable data) {
        Map<String, Object> expectedEntries = data.asMap(String.class, String.class);
        Response response = Serenity.sessionVariableCalled(API_RESPONSE);
        JsonPath json = response.jsonPath();
        expectedEntries.keySet().forEach(field -> {
            assertThat(String.format("The response has a wrong value for the field '%s'!", field),
                    json.getString(field), is(expectedEntries.get(field)));
        });
    }

    @Then("API user Update Date is correct")
    public void checkUpdateDate() {
        Response response = Serenity.sessionVariableCalled(API_RESPONSE);
        LocalDateTime actualDateTime = ZonedDateTime.parse(response.path("updatedAt")).toLocalDateTime();

        LocalDateTime expectedDateTime = Serenity.sessionVariableCalled(UPDATED_DATE_TIME);
        assertThat("", actualDateTime, LocalDateTimeMatchers.within(1, ChronoUnit.SECONDS, expectedDateTime));
    }

}
