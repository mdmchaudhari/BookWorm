package com.example.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Product;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByProductNameContainingIgnoreCaseOrProductEnglishNameContainingIgnoreCase(
            String productName,
            String productEnglishName,
            Pageable pageable
    );
}
