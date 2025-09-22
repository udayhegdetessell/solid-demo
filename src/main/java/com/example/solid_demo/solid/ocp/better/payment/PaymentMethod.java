package com.example.solid_demo.solid.ocp.better.payment;

/**
 * @author udayhegde
 */
public interface PaymentMethod {

    void processPayment(double amount);

    String getPaymentType();
}