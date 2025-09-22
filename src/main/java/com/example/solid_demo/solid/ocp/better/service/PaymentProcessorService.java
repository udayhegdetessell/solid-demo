package com.example.solid_demo.solid.ocp.better.service;

/**
 * @author udayhegde
 */
public interface PaymentProcessorService {

  void processPayment(String paymentType, double amount);
}
