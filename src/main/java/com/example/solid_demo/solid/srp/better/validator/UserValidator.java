package com.example.solid_demo.solid.srp.better.validator;

import com.example.solid_demo.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author udayhegde
 */
@Component
public class UserValidator {

  public void validate(User user) {
    if (user.getName() == null || user.getName().isEmpty()) {
      throw new IllegalArgumentException("Name is required");
    }
  }

}
