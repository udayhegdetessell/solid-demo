package com.example.solid_demo.solid.dip.bad.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author udayhegde
 */
@Service
@Slf4j
public class EmailService {
    
    public void sendEmail(String to, String subject, String body) {
        // Direct SMTP implementation
        log.info("Sending email via SMTP...");
        log.info("To: " + to);
        log.info("Subject: " + subject);
    }
}