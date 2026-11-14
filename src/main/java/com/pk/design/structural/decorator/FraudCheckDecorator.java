package com.pk.design.structural.decorator;

public class FraudCheckDecorator extends PaymentDecorator {

    private static final double FRAUD_THRESHOLD = 10_000.0;

    public FraudCheckDecorator(PaymentService delegate) {
        super(delegate);
    }

    @Override
    public boolean processPayment(String account, double amount) {
        if (amount > FRAUD_THRESHOLD) {
            System.out.printf("[FRAUD CHECK] Payment of $%.2f exceeds threshold — blocked!%n", amount);
            return false;
        }
        System.out.println("[FRAUD CHECK] Passed.");
        return delegate.processPayment(account, amount);
    }
}
