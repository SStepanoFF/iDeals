package ideals.model.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserRequestDto {

    private String name;

    private String job;

}
