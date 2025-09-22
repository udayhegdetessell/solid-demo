package com.example.solid_demo.solid.ocp.better.service.impl;

import com.example.solid_demo.solid.ocp.better.payment.PaymentMethod;
import com.example.solid_demo.solid.ocp.better.service.PaymentProcessorService;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 * @author udayhegde
 */
@Service
public class PaymentProcessorServiceImpl implements PaymentProcessorService {

  private final Map<String, PaymentMethod> paymentMethods;

  public PaymentProcessorServiceImpl(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods.stream()
        .collect(Collectors.toMap(
            PaymentMethod::getPaymentType,
            Function.identity()
        ));
  }

  @Override
  public void processPayment(String paymentType, double amount) {
    PaymentMethod paymentMethod = paymentMethods.get(paymentType);

    if (paymentMethod == null) {
      throw new RuntimeException(
          "Payment method not supported: " + paymentType);
    }

    paymentMethod.processPayment(amount);
  }
}
