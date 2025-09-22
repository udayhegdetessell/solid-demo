package com.example.solid_demo.solid.dip.better.config;

import com.example.solid_demo.solid.dip.better.repository.MongoUserRepository;
import com.example.solid_demo.solid.dip.better.repository.MySQLUserRepository;
import com.example.solid_demo.solid.dip.better.repository.UserRepository;
import com.example.solid_demo.solid.dip.better.service.NotificationService;
import com.example.solid_demo.solid.dip.better.service.impl.EmailNotificationService;
import com.example.solid_demo.solid.dip.better.service.impl.SMSNotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;


/**
 * @author udayhegde
 */
// Configuration to wire dependencies
@Configuration
public class AppConfig {
    
    @Bean
    @Primary
    public UserRepository userRepository() {
        return new MySQLUserRepository(); // Can easily switch to MongoUserRepository
    }
    
    @Bean
    @Primary
    public NotificationService notificationService() {
        return new EmailNotificationService(); // Can easily switch to SMSNotificationService
    }
    
    // Alternative configuration using profiles
    @Bean
    @Profile("mongodb")
    public UserRepository mongoUserRepository() {
        return new MongoUserRepository();
    }
    
    @Bean
    @Profile("sms")
    public NotificationService smsNotificationService() {
        return new SMSNotificationService();
    }
}