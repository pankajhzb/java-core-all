package com.pk.design.structural.decorator;

public class BasicPayment implements PaymentService {

    @Override
    public boolean processPayment(String account, double amount) {
        System.out.printf("Processing payment of $%.2f for account [%s]%n", amount, account);
        return true;
    }
}
