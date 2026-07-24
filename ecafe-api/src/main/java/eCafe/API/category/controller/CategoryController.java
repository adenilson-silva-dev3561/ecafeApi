package eCafe.API.category.controller;

import eCafe.API.category.dto.CategoryRequest;
import eCafe.API.category.dto.CategoryResponse;
import eCafe.API.category.service.CategoryService;
import eCafe.API.common.constants.ApiRoutes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(ApiRoutes.CATEGORY)
@RestController
@AllArgsConstructor
@Tag(name = "Gerenciamento de categorias")
public class CategoryController {

    private final CategoryService categoryService;

    @Operation(description = "Cadastrar categoria.")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Categoria cadastrada com sucesso!"),
            @ApiResponse(responseCode = "400", description = "Dados inválidos."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @PostMapping
    public ResponseEntity<CategoryResponse> createCategory(@RequestBody @Valid CategoryRequest dto) {

        CategoryResponse category = categoryService.create(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(category);
    }

    @Operation(description = "Atualizar categoria.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Categoria atualizada com sucesso!"),
            @ApiResponse(responseCode = "400", description = "Dados inválidos."),
            @ApiResponse(responseCode = "404", description = "Categoria não encontrada."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @PutMapping("/{id}")
    public ResponseEntity<CategoryResponse> updateCategory(@PathVariable Long id,
                                                           @RequestBody @Valid CategoryRequest dto) {

        CategoryResponse updated = categoryService.updateCategory(id, dto);

        return ResponseEntity.ok(updated);
    }

    @Operation(description = "Listar todas as categorias.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Categorias retornadas com sucesso."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @GetMapping
    public ResponseEntity<List<CategoryResponse>> findAll() {

        List<CategoryResponse> category = categoryService.findAll();

        return ResponseEntity.ok(category);
    }

    @Operation(description = "Buscar categoria pelo ID.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Categoria encontrada com sucesso."),
            @ApiResponse(responseCode = "404", description = "Categoria não encontrada."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponse> findById(@PathVariable Long id) {

        CategoryResponse category = categoryService.categoryId(id);

        return ResponseEntity.ok(category);
    }

    @Operation(description = "Excluir categoria pelo ID.")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Categoria excluída com sucesso."),
            @ApiResponse(responseCode = "404", description = "Categoria não encontrada."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        categoryService.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
