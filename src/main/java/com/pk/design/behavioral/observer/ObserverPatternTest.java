package com.pk.design.behavioral.observer;

public class ObserverPatternTest {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.subscribe(new AuditLogObserver());
        processor.subscribe(new EmailNotificationObserver());
        processor.subscribe(new FraudAlertObserver());

        // Normal payment — notifies all 3 observers
        processor.processPayment("ACC1234567890", 500.00);

        // Suspicious payment — FraudAlertObserver also fires
        processor.processPayment("ACC9876543210", 9_500.00);

        // Failed payment — EmailNotificationObserver notifies failure
        processor.failPayment("ACC1234567890", 200.00);

        // Unsubscribe email and process again
        System.out.println("\n--- Unsubscribed EmailNotificationObserver ---");
        EmailNotificationObserver email = new EmailNotificationObserver();
        processor.subscribe(email);
        processor.unsubscribe(email);
        processor.processPayment("ACC1234567890", 300.00);
    }
}
