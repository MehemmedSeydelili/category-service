package az.expressbank.categorystructure.data.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryRequestDto {

    @NotBlank(message = "Category name cannot be blank")
    private String categoryName;

    @NotNull(message = "Parent ID cannot be null")
    private Long parentId;

    private String description;

    @NotBlank(message = "Category group cannot be blank")
    private String categoryGroup;

    @NotBlank(message = "Keyword cannot be blank")
    private String keyword;

}
