package ideals.model.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserResponseDto {

    private String name;

    private String job;

    private String id;

    private String createdAt;

}
