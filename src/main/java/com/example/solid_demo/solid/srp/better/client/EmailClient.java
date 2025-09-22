package com.example.solid_demo.solid.srp.better.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author udayhegde
 */
@Component
@Slf4j
public class EmailClient {

  public void sendEmail(String toAddress, String subject, String body) {
    log.info("Sending email to {} with subject {} and body {}", toAddress, subject, body);
  }
}
