package eCafe.API.product.service;

import eCafe.API.product.dto.ProductRequest;
import eCafe.API.product.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse create(ProductRequest request);

    ProductResponse update(Long id, ProductRequest request);

    List<ProductResponse> findAll();

    ProductResponse findById(Long id);

    List<ProductResponse> produtoCategoryId(Long id);

    List<ProductResponse>findByNameContains(String name);

    void deleteById(Long id);
}
