package com.example.solid_demo.solid.dip.better.service;

import com.example.solid_demo.entity.User;

/**
 * @author udayhegde
 */
public interface UserService {

  void registerUser(String name, String email);

  User getUser(Long id);
}
