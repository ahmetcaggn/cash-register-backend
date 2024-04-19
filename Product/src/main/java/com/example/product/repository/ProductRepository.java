package com.example.product.repository;

import com.example.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Optional<Product> findByIdAndIsDeletedFalse(Long id);
    Set<Product> findAllByIsDeletedFalse();
}
