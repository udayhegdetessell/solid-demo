package com.example.solid_demo.solid.dip.bad.service;

import com.example.solid_demo.entity.User;
import com.example.solid_demo.solid.dip.bad.repository.MySQLUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author udayhegde
 */
// High-level module directly depends on low-level modules
@Service
@Slf4j
public class UserService {
    
    // Direct dependencies on concrete classes!
    private MySQLUserRepository userRepository = new MySQLUserRepository();
    private EmailService emailService = new EmailService();
    
    public void registerUser(String name, String email) {
        User user = new User(null, name, email);
        
        // Directly coupled to MySQL implementation
        userRepository.save(user);
        
        // Directly coupled to SMTP email implementation
        emailService.sendEmail(email, "Welcome!", "Welcome to our platform!");
        
        log.info("User registered successfully!");
    }
    
    public User getUser(Long id) {
        // Directly coupled to MySQL implementation
        return userRepository.findById(id);
    }
}