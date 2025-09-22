package com.example.solid_demo.solid.dip.better.service.impl;

import com.example.solid_demo.entity.User;
import com.example.solid_demo.solid.dip.better.repository.UserRepository;
import com.example.solid_demo.solid.dip.better.service.NotificationService;
import com.example.solid_demo.solid.dip.better.service.UserService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * @author udayhegde
 */
// High-level module depends on abstractions
@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    
    // Dependency injection - depends on abstractions!
    private final UserRepository userRepository;
    private final NotificationService notificationService;

    @Override
    public void registerUser(String name, String email) {
        // Check if user already exists
        Optional<User> existingUser = userRepository.findByEmail(email);
        if (existingUser.isPresent()) {
            throw new IllegalArgumentException("User with email already exists");
        }
        
        User user = new User(null, name, email);
        
        // Works with any UserRepository implementation
        User savedUser = userRepository.save(user);
        
        // Works with any NotificationService implementation
        notificationService.sendNotification(
            email, 
            "Welcome!", 
            "Welcome to our platform, " + name + "!");
        
        log.info("User registered successfully with ID: " + savedUser.getId());
    }

    @Override
    public User getUser(Long id) {
        // Works with any UserRepository implementation
        return userRepository.findById(id);
    }
}