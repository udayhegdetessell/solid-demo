package com.example.solid_demo.solid.srp.better.service.impl;

import com.example.solid_demo.entity.User;
import com.example.solid_demo.solid.srp.better.repository.UserRepository;
import com.example.solid_demo.solid.srp.better.service.ReportService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author udayhegde
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

  private final UserRepository userRepository;

  @Override
  public void generateReport(Long userId) {
    User user = userRepository.findById(userId)
        .orElseThrow(() -> new RuntimeException("User not found"));
    buildReportContent(user);
  }

  private String buildReportContent(User user) {
    return String.format("""
            User Report
            Name: %s
            Email: %s
            ID: %d
            """,
        user.getName(), user.getEmail(), user.getId());
  }
}
