package eCafe.API.product.service;

import eCafe.API.product.dto.ProductRequest;
import eCafe.API.product.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse create(ProductRequest request);

    ProductResponse update(Long id, ProductRequest request);

    List<ProductResponse> findAll();

    void deleteById(Long id);
}
