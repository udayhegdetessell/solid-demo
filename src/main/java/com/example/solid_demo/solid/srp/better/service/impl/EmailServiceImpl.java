package com.example.solid_demo.solid.srp.better.service.impl;

import com.example.solid_demo.entity.User;
import com.example.solid_demo.solid.srp.better.client.EmailClient;
import com.example.solid_demo.solid.srp.better.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author udayhegde
 */
@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

  private final EmailClient emailClient;

  @Override
  public void send(User savedUser) {
    String subject = "Welcome " + savedUser.getName();
    String body = "Thank you for registering!";
    emailClient.sendEmail(savedUser.getEmail(), subject, body);
  }
}
