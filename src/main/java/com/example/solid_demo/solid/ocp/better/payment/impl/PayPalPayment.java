package com.example.solid_demo.solid.ocp.better.payment.impl;

import com.example.solid_demo.enums.PaymentType;
import com.example.solid_demo.solid.ocp.better.payment.PaymentMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author udayhegde
 */
@Component
@Slf4j
public class PayPalPayment implements PaymentMethod {

  @Override
  public void processPayment(double amount) {
    log.info("Processing PayPal payment: {}", amount);
    // PayPal specific logic
    authenticatePayPal();
    transferFunds(amount);
  }

  @Override
  public String getPaymentType() {
    return PaymentType.PAYPAL.name();
  }

  private void authenticatePayPal() {
    // PayPal authentication
  }

  private void transferFunds(double amount) {
    // Transfer logic
  }
}