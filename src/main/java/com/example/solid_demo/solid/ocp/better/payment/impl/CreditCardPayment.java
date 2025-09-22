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
public class CreditCardPayment implements PaymentMethod {

  @Override
  public void processPayment(double amount) {
    log.info("Processing credit card payment: {}", amount);
    // Credit card specific logic
    validateCard();
    chargeCard(amount);
  }

  @Override
  public String getPaymentType() {
    return PaymentType.CREDIT_CARD.name();
  }

  private void validateCard() {
    // Card validation logic
  }

  private void chargeCard(double amount) {
    // Charging logic
  }
}