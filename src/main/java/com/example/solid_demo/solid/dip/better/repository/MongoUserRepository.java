package com.example.solid_demo.solid.dip.better.repository;

import com.example.solid_demo.entity.User;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author udayhegde
 */
@Repository
@Slf4j
public class MongoUserRepository implements UserRepository {

  @Override
  public User findById(Long id) {
    log.info("Finding user in MongoDB...");
    // MongoDB specific implementation
    return new User(id, "Jane Doe", "jane@example.com");
  }

  @Override
  public User save(User user) {
    log.info("Saving user to MongoDB...");
    // MongoDB save logic
    return user;
  }

  @Override
  public Optional<User> findByEmail(String email) {
    log.info("Finding user by email in MongoDB...");
    return Optional.empty();
  }
}