package com.example.solid_demo.solid.srp.bad;

import com.example.solid_demo.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *  Violates SRP - Multiple responsibilities
 * @author udayhegde 
 */
@Service
@Slf4j
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;

    // Database operations
    public void saveUser(User user) {
        EntityManager em = getEntityManager();
        em.persist(user);
    }
    
    // Email functionality
    public void sendWelcomeEmail(User user) {
        String subject = "Welcome " + user.getName();
        String body = "Thank you for registering!";
        send(user.getEmail(), subject, body);
    }
    
    // Validation logic
    public boolean validateUser(User user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            return false;
        }
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            return false;
        }
        return true;
    }
    
    // Report generation
    public String generateUserReport(Long userId) {
        User user = findById(userId);
        return "User Report: " + user.getName() +
               " - Email: " + user.getEmail();
    }

    // Helper method to get EntityManager
    private EntityManager getEntityManager() {
        return entityManager;
    }

    // Helper method to find user by ID
    private User findById(Long userId) {
        return entityManager.find(User.class, userId);
    }

  public void send(String toAddress, String subject, String body) {
    log.info("Sending email to {} with subject {} and body {}", toAddress, subject, body);
  }
}