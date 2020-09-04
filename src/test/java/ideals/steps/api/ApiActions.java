package ideals.steps.api;

import ideals.model.dto.request.CreateUserRequestDto;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiActions extends ScenarioSteps {

    @Step
    public CreateUserRequestDto createUserBody(String name, String job) {
        return CreateUserRequestDto.builder()
                .name(name)
                .job(job)
                .build();
    }
}
