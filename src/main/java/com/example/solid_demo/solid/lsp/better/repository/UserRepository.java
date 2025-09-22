package com.example.solid_demo.solid.lsp.better.repository;

import com.example.solid_demo.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author udayhegde
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Inherits all methods and follows the same contract
    Optional<User> findByEmail(String email);
}