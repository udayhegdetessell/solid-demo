package com.example.solid_demo.solid.dip.better.service;

/**
 * @author udayhegde
 */
public interface NotificationService {
    void sendNotification(String recipient, String subject, String message);
}