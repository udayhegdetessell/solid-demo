package com.example.solid_demo.solid.dip.better.repository;

import com.example.solid_demo.entity.User;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author udayhegde
 */
// Low-level modules implement abstractions
@Repository
@Slf4j
public class MySQLUserRepository implements UserRepository {

  @Override
  public User findById(Long id) {
    log.info("Finding user in MySQL database...");
    // MySQL specific implementation
    return new User(id, "John Doe", "john@example.com");
  }

  @Override
  public User save(User user) {
    log.info("Saving user to MySQL database...");
    // MySQL save logic
    return user;
  }

  @Override
  public Optional<User> findByEmail(String email) {
    log.info("Finding user by email in MySQL...");
    // MySQL query logic
    return Optional.empty();
  }
}