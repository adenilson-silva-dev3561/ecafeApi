package eCafe.API.product.controller;

import eCafe.API.common.constants.ApiRoutes;
import eCafe.API.product.dto.ProductRequest;
import eCafe.API.product.dto.ProductResponse;
import eCafe.API.product.service.ProductService;
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
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody @Valid ProductRequest dto) {

        ProductResponse product = productService.create(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductResponse> update(@PathVariable Long id, @RequestBody @Valid ProductRequest dto) {

        ProductResponse updateProduct = productService.update(id, dto);

        return ResponseEntity.ok(updateProduct);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> findAll() {
        List<ProductResponse> products = productService.findAll();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> findById(@PathVariable Long id){

        ProductResponse product = productService.findById(id);

        return ResponseEntity.ok(product);
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<List<ProductResponse>> getProductCategory(@Valid @PathVariable Long id){
        List<ProductResponse> product = productService.productCategoryId(id);

        return ResponseEntity.ok(product);
    }

    @GetMapping("/includes/{name}")
    public ResponseEntity<List<ProductResponse>> getProductContainName(@PathVariable String name){
        List<ProductResponse> product = productService.findByNameContains(name);

        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        productService.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
