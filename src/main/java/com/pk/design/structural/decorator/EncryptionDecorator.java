package com.pk.design.structural.decorator;

public class EncryptionDecorator extends PaymentDecorator {

    public EncryptionDecorator(PaymentService delegate) {
        super(delegate);
    }

    @Override
    public boolean processPayment(String account, double amount) {
        String masked = "*".repeat(account.length() - 4) + account.substring(account.length() - 4);
        System.out.printf("[ENCRYPTION] Account masked: %s%n", masked);
        return delegate.processPayment(masked, amount);
    }
}
