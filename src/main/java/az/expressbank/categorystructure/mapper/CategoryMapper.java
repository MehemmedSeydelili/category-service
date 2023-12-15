package az.expressbank.categorystructure.mapper;

import az.expressbank.categorystructure.data.dto.request.CategoryRequestDto;
import az.expressbank.categorystructure.data.dto.response.CategoryResponseDto;
import az.expressbank.categorystructure.data.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "parent", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "createAt", ignore = true)
    Category mapDtoToEntity(CategoryRequestDto dto);

    @Mapping(source = "parent.id", target = "parentId")
    CategoryRequestDto mapEntityToDto(Category category);
    //CategoryResponseDto mapEntityToResponse(Category category);

}
