package eCafe.API.category.service.impl;

import eCafe.API.category.dto.CategoryRequest;
import eCafe.API.category.dto.CategoryResponse;
import eCafe.API.category.entity.Category;
import eCafe.API.category.repository.CategoryRepository;
import eCafe.API.category.service.CategoryService;
import eCafe.API.common.constants.ErrorMessages;
import eCafe.API.common.constants.LogMessages;
import eCafe.API.common.exception.BusinessException;
import eCafe.API.common.exception.ResourceNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    @Transactional
    public CategoryResponse create(CategoryRequest request) {

        log.info(LogMessages.CATEGORY_CREATE_START, request.name());

        validateCategoryName(request.name());

        Category category = Category.builder()
                .name(request.name())
                .description(request.description())
                .build();

        category = categoryRepository.save(category);

        log.info(LogMessages.CATEGORY_CREATE_SUCCESS, category.getId());

        return toDto(category);
    }

    @Override
    @Transactional
    public CategoryResponse updateCategory(Long id, CategoryRequest request) {

        log.info(LogMessages.CATEGORY_UPDATE_START, id);

        Category category = findCategoryById(id);

        validateCategoryNameForUpdate(request.name(), id);

        category.setName(request.name());
        category.setDescription(request.description());

        Category updatedCategory = categoryRepository.save(category);

        log.info(LogMessages.CATEGORY_UPDATE_SUCCESS, updatedCategory.getId());

        return toDto(updatedCategory);
    }

    @Override
    public List<CategoryResponse> findAll() {

        log.info(LogMessages.CATEGORY_FIND_ALL);

        return categoryRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    @Override
    public CategoryResponse categoryId(Long id){

        log.info(LogMessages.CATEGORY_FIND_BY_ID, id);

        Category category = categoryRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(LogMessages.CATEGORY_NOT_FOUND + id));

        log.info(LogMessages.PRODUCT_FOUND_SUCCESSFULLY , id);

        return toDto(category);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {

        log.info(LogMessages.CATEGORY_DELETE_START, id);

        Category category = findCategoryById(id);

        categoryRepository.delete(category);

        log.info(LogMessages.CATEGORY_DELETE_SUCCESS, category.getName());
    }

    private Category findCategoryById(Long id) {

        return categoryRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn(LogMessages.CATEGORY_NOT_FOUND, id);
                    return new ResourceNotFoundException(
                            ErrorMessages.CATEGORY_NOT_FOUND + id);
                });
    }

    private void validateCategoryName(String name) {

        if (categoryRepository.existsByNameIgnoreCase(name)) {

            log.warn(LogMessages.CATEGORY_ALREADY_EXISTS, name);

            throw new BusinessException(ErrorMessages.CATEGORY_ALREADY_EXISTS);
        }
    }

    private void validateCategoryNameForUpdate(String name, Long id) {

        categoryRepository.findByNameIgnoreCase(name)
                .filter(category -> !category.getId().equals(id))
                .ifPresent(category -> {

                    log.warn(LogMessages.CATEGORY_ALREADY_EXISTS_UPDATE, name);

                    throw new BusinessException(ErrorMessages.CATEGORY_ALREADY_EXISTS);
                });
    }

    private CategoryResponse toDto(Category category) {

        return new CategoryResponse(
                category.getId(),
                category.getName(),
                category.getDescription()
        );
    }
}