package com.example.solid_demo.solid.dip.better.repository;

import com.example.solid_demo.entity.User;
import java.util.Optional;

/**
 * @author udayhegde
 */
// Abstractions (interfaces)
public interface UserRepository {
    User findById(Long id);
    User save(User user);
    Optional<User> findByEmail(String email);
}