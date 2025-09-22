package com.example.solid_demo.srp.bad;

import com.example.solid_demo.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

/**
 *  Violates SRP - Multiple responsibilities
 * @author udayhegde 
 */
@Service
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;

    // Database operations
    public void saveUser(User user) {
        // Database logic
        EntityManager em = getEntityManager();
        em.persist(user);
    }
    
    // Email functionality
    public void sendWelcomeEmail(User user) {
        // Email logic
        String subject = "Welcome " + user.getName();
        String body = "Thank you for registering!";
        EmailUtil.send(user.getEmail(), subject, body);
    }
    
    // Validation logic
    public boolean validateUser(User user) {
        // Validation logic
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
        // Report logic
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
}