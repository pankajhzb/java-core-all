package com.pk.design.structural.decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        PaymentService payment = new LoggingDecorator(
                new FraudCheckDecorator(
                        new EncryptionDecorator(
                                new BasicPayment())));

        System.out.println("=== Normal Payment ===");
        payment.processPayment("ACC1234567890", 500.00);

        System.out.println("\n=== High-Value Payment (Fraud Blocked) ===");
        payment.processPayment("ACC1234567890", 15_000.00);
    }
}
