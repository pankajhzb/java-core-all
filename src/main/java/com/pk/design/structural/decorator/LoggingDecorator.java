package com.pk.design.structural.decorator;

public class LoggingDecorator extends PaymentDecorator {

    public LoggingDecorator(PaymentService delegate) {
        super(delegate);
    }

    @Override
    public boolean processPayment(String account, double amount) {
        System.out.printf("[LOG] Initiating payment: account=%s, amount=$%.2f%n", account, amount);
        boolean result = delegate.processPayment(account, amount);
        System.out.printf("[LOG] Payment result: %s%n", result ? "SUCCESS" : "FAILED");
        return result;
    }
}
