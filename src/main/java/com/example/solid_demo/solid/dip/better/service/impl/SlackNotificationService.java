package com.example.solid_demo.solid.dip.better.service.impl;

import com.example.solid_demo.solid.dip.better.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * @author udayhegde
 */
@Service
@Slf4j
public class SlackNotificationService implements NotificationService {

  @Override
  public void sendNotification(String recipient, String subject, String message) {
    log.info("Sending Slack notification...");
    log.info("Channel: " + recipient);
    log.info("Message: " + subject + "\n" + message);
  }
}