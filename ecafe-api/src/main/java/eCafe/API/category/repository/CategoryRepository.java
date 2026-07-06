package eCafe.API.category.repository;

import eCafe.API.category.entity.Category;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    boolean existsByNameIgnoreCase(String name);

    @NonNull
    Optional<Category> findById(@NonNull Long id);

    Optional<Category> findByNameIgnoreCase(String name);

}