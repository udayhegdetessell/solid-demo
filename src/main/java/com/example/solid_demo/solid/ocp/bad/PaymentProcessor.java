package com.example.solid_demo.solid.ocp.bad;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author udayhegde
 */
// Violates OCP - Need to modify class for new payment types
@Service
@Slf4j
public class PaymentProcessor {
    
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CREDIT_CARD")) {
            // Credit card processing
           log.info("Processing credit card payment: {}", amount);
            // Credit card specific logic
            
        } else if (paymentType.equals("PAYPAL")) {
            // PayPal processing
          log.info("Processing PayPal payment: {}",  amount);
            // PayPal specific logic
            
        } else if (paymentType.equals("BANK_TRANSFER")) {
            // Bank transfer processing
          log.info("Processing bank transfer: {}", amount);
            // Bank transfer specific logic
        }
        // What happens when we need to add cryptocurrency payments?
        // We have to modify this method!
    }
}