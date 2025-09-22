package com.example.solid_demo.solid.lsp.better.repository;

import java.util.Optional;

/**
 * @author udayhegde
 */
// Better example with Spring Data Repository
public interface Repository<T, ID> {
    Optional<T> findById(ID id);
    T save(T entity);
    void deleteById(ID id);
}