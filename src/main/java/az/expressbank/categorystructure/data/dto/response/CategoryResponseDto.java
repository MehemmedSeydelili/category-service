package az.expressbank.categorystructure.data.dto.response;

import az.expressbank.categorystructure.data.entity.Category;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class CategoryResponseDto {

    //todo change this class

    private String categoryName;
    private Category parent;
    private String description;
    private String categoryGroup;
    private String keyword;
    private LocalDateTime createAt;

}
