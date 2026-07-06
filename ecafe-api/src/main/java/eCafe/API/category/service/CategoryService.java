package eCafe.API.category.service;

import eCafe.API.category.dto.CategoryRequest;
import eCafe.API.category.dto.CategoryResponse;

import java.util.List;

public interface CategoryService {

    CategoryResponse create(CategoryRequest request);

    CategoryResponse updateCategory(Long id, CategoryRequest request );

    List<CategoryResponse> findAll();

    void deleteById(Long id);

}
