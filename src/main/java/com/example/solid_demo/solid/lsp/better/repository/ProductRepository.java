package com.example.solid_demo.solid.lsp.better.repository;

import com.example.solid_demo.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author udayhegde
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Also follows the same contract - can be substituted
    List<Product> findByCategory(String category);
}