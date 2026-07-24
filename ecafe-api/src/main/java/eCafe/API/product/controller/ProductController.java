package eCafe.API.product.controller;

import eCafe.API.common.constants.ApiRoutes;
import eCafe.API.product.dto.ProductRequest;
import eCafe.API.product.dto.ProductResponse;
import eCafe.API.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(ApiRoutes.PRODUCT)
@RestController
@RequiredArgsConstructor
@Tag(name = "Gerenciamento de produtos.")
public class ProductController {

    private final ProductService productService;

    @Operation(description = "Cadastrar produtos.")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Produto cadastrado com sucesso!"),
            @ApiResponse(responseCode = "400", description = "Dados inválidos."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody @Valid ProductRequest dto) {

        ProductResponse product = productService.create(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @Operation(description = "Atualizar produto.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Produto atualizado com sucesso!"),
            @ApiResponse(responseCode = "400", description = "Dados inválidos."),
            @ApiResponse(responseCode = "404", description = "Produto não encontrado."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @PutMapping("/{id}")
    public ResponseEntity<ProductResponse> update(@PathVariable Long id,
                                                  @RequestBody @Valid ProductRequest dto) {

        ProductResponse updateProduct = productService.update(id, dto);

        return ResponseEntity.ok(updateProduct);
    }

    @Operation(description = "Listar todos os produtos.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Lista de produtos retornada com sucesso."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @GetMapping
    public ResponseEntity<List<ProductResponse>> findAll() {

        List<ProductResponse> products = productService.findAll();

        return ResponseEntity.ok(products);
    }

    @Operation(description = "Buscar produto pelo ID.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Produto encontrado com sucesso."),
            @ApiResponse(responseCode = "404", description = "Produto não encontrado."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> findById(@PathVariable Long id) {

        ProductResponse product = productService.findById(id);

        return ResponseEntity.ok(product);
    }

    @Operation(description = "Listar produtos por categoria.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Produtos da categoria retornados com sucesso."),
            @ApiResponse(responseCode = "404", description = "Categoria não encontrada."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @GetMapping("/category/{id}")
    public ResponseEntity<List<ProductResponse>> getProductCategory(@Valid @PathVariable Long id) {

        List<ProductResponse> product = productService.productCategoryId(id);

        return ResponseEntity.ok(product);
    }

    @Operation(description = "Buscar produtos contendo o nome informado.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Produtos encontrados com sucesso."),
            @ApiResponse(responseCode = "404", description = "Nenhum produto encontrado."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @GetMapping("/includes/{name}")
    public ResponseEntity<List<ProductResponse>> getProductContainName(@PathVariable String name) {

        List<ProductResponse> product = productService.findByNameContains(name);

        return ResponseEntity.ok(product);
    }

    @Operation(description = "Excluir produto pelo ID.")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Produto excluído com sucesso."),
            @ApiResponse(responseCode = "404", description = "Produto não encontrado."),
            @ApiResponse(responseCode = "500", description = "Erro interno do servidor.")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        productService.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
