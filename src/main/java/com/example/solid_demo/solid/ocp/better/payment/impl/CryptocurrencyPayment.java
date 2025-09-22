package com.example.solid_demo.solid.ocp.better.payment.impl;

import com.example.solid_demo.solid.ocp.better.payment.PaymentMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author udayhegde
 */
@Component
@Slf4j
public class CryptocurrencyPayment implements PaymentMethod {

  @Override
  public void processPayment(double amount) {
    log.info("Processing cryptocurrency payment: {}", amount);
    // Cryptocurrency specific logic
    validateWallet();
    transferCrypto(amount);
  }

  @Override
  public String getPaymentType() {
    return "CRYPTOCURRENCY";
  }

  private void validateWallet() {
    // Wallet validation
  }

  private void transferCrypto(double amount) {
    // Crypto transfer logic
  }
}