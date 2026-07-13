package eCafe.API.product.repository;

import eCafe.API.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    boolean existsByNameIgnoreCase(String name);


    List<Product> findByCategoryId(Long categoryId);

    List<Product>findByNameContainingIgnoreCase(String name);

    Optional<Product> findByNameIgnoreCase(String name);
}
