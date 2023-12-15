package az.expressbank.categorystructure.mapper;

import az.expressbank.categorystructure.data.dto.request.CategoryRequestDto;
import az.expressbank.categorystructure.data.dto.response.CategoryResponseDto;
import az.expressbank.categorystructure.data.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    Category mapDtoToEntity(CategoryRequestDto dto);
    CategoryResponseDto mapEntityToResponse(Category category);

}
