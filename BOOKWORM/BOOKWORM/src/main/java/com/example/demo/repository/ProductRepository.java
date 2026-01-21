package com.example.demo.repository;

import com.example.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByProductNameContainingIgnoreCaseOrProductEnglishNameContainingIgnoreCase(
            String productName,
            String productEnglishName,
            Pageable pageable
    );
}

