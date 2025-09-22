package com.example.solid_demo.solid.dip.better.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.solid_demo.entity.User;
import com.example.solid_demo.solid.dip.better.repository.UserRepository;
import com.example.solid_demo.solid.dip.better.service.NotificationService;
import com.example.solid_demo.solid.dip.better.service.UserService;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author udayhegde
 */
// Easy to test with mocks
@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {


  @Mock
  private UserRepository userRepository;

  @Mock
  private NotificationService notificationService;

  @InjectMocks
  private UserService userService;

  @Test
  void shouldRegisterUser() {
    // Given
    User user = new User(null, "John", "john@test.com");
    User savedUser = new User(1L, "John", "john@test.com");

    when(userRepository.findByEmail("john@test.com")).thenReturn(Optional.empty());
    when(userRepository.save(any(User.class))).thenReturn(savedUser);

    // When
    userService.registerUser("John", "john@test.com");

    // Then
    verify(userRepository).save(any(User.class));
    verify(notificationService).sendNotification(eq("john@test.com"), anyString(), anyString());
  }
}