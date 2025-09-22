package com.example.solid_demo.solid.srp.better.service.impl;

import com.example.solid_demo.entity.User;
import com.example.solid_demo.solid.srp.better.repository.UserRepository;
import com.example.solid_demo.solid.srp.better.service.EmailService;
import com.example.solid_demo.solid.srp.better.service.ReportService;
import com.example.solid_demo.solid.srp.better.service.UserService;
import com.example.solid_demo.solid.srp.better.validator.UserValidator;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author udayhegde
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


  private final UserRepository userRepository;
  private final UserValidator userValidator;
  private final EmailService emailService;
  private final ReportService reportService;

  @Override
  public User createUser(User user) {
    userValidator.validate(user);
    User savedUser = userRepository.save(user);
    emailService.send(savedUser);
    reportService.generateReport(savedUser.getId());
    return savedUser;
  }

  public Optional<User> findById(Long id) {
    return userRepository.findById(id);
  }
}