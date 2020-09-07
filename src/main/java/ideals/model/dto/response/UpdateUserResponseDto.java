package ideals.model.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateUserResponseDto {

    private String name;

    private String job;

    private String updatedAt;

}
