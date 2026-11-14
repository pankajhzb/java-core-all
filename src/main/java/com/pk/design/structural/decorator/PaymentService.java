package com.pk.design.structural.decorator;

public interface PaymentService {
    boolean processPayment(String account, double amount);
}
