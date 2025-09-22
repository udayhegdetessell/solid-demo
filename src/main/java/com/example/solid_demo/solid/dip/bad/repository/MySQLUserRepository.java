package com.example.solid_demo.solid.dip.bad.repository;

import com.example.solid_demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author udayhegde
 */
@Repository
@Slf4j
public class MySQLUserRepository {
    
    public User findById(Long id) {
        // MySQL specific implementation
        log.info("Finding user in MySQL database...");
        // Direct MySQL connection code
        return new User(id, "John Doe", "john@example.com");
    }
    
    public void save(User user) {
        // MySQL specific save logic
      log.info("Saving user to MySQL database...");
    }
}