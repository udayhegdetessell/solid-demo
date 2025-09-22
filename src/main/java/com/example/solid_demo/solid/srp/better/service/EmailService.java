package com.example.solid_demo.solid.srp.better.service;

import com.example.solid_demo.entity.User;

/**
 * @author udayhegde
 */
public interface EmailService {

  void send(User savedUser);
}
