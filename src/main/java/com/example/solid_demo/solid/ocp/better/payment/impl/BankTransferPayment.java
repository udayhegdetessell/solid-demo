package com.example.solid_demo.solid.ocp.better.payment.impl;

import static com.example.solid_demo.enums.PaymentType.BANK_TRANSFER;

import com.example.solid_demo.solid.ocp.better.payment.PaymentMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author udayhegde
 */
@Component
@Slf4j
public class BankTransferPayment implements PaymentMethod {

  @Override
  public void processPayment(double amount) {
    log.info("Processing bank transfer: {}", amount);
    // Bank transfer specific logic
    validateAccount();
    initiateTransfer(amount);
  }

  @Override
  public String getPaymentType() {
    return BANK_TRANSFER.name();
  }

  private void validateAccount() {
    // Account validation
  }

  private void initiateTransfer(double amount) {
    // Transfer initiation
  }
}