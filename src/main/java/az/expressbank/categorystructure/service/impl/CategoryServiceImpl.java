package az.expressbank.categorystructure.service.impl;

import az.expressbank.categorystructure.data.dto.request.CategoryRequestDto;
import az.expressbank.categorystructure.data.entity.Category;
import az.expressbank.categorystructure.data.repository.CategoryRepository;
import az.expressbank.categorystructure.mapper.CategoryMapper;
import az.expressbank.categorystructure.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public CategoryRequestDto crateCategory(CategoryRequestDto dto) {

        //Category c = getById(dto.getParentId());

        Category category = CategoryMapper.INSTANCE.mapDtoToEntity(dto);
        //category.setParent(c);
        category.setCreateAt(LocalDateTime.now());
        category.setStatus(1);
        categoryRepository.save(category);
        return CategoryMapper.INSTANCE.mapEntityToDto(category);
    }

    public Optional<Category> getById(Long id){
        return categoryRepository.findById(id);
    }
}
