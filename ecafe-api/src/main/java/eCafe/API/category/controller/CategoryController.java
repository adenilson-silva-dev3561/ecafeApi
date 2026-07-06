package eCafe.API.category.controller;

import eCafe.API.category.dto.CategoryRequest;
import eCafe.API.category.dto.CategoryResponse;
import eCafe.API.category.service.CategoryService;
import eCafe.API.common.constants.ApiRoutes;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(ApiRoutes.CATEGORY)
@RestController
@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryResponse> createCategory(@RequestBody @Valid  CategoryRequest dto){

        CategoryResponse category = categoryService.create(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(category);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryResponse> updateCategory(@PathVariable Long id, @RequestBody CategoryRequest dto){

        CategoryResponse updated = categoryService.updateCategory(id, dto);

        return ResponseEntity.ok(updated);
    }

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> findAll(){

        List<CategoryResponse> category = categoryService.findAll();
        return ResponseEntity.ok(category);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponse> findById( @Valid @PathVariable Long id){

        CategoryResponse category = categoryService.categoryId(id);

        return ResponseEntity.status(HttpStatus.OK).body(category);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){

        categoryService.deleteById(id);

        return ResponseEntity.noContent().build();

    }

}
