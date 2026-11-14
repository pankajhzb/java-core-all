package com.pk.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcessor implements PaymentSubject {

    private static final double SUSPICIOUS_THRESHOLD = 9_000.0;
    private final List<PaymentObserver> observers = new ArrayList<>();

    @Override
    public void subscribe(PaymentObserver observer)   { observers.add(observer); }

    @Override
    public void unsubscribe(PaymentObserver observer) { observers.remove(observer); }

    @Override
    public void notifyObservers(PaymentEvent event) {
        observers.forEach(o -> o.onPaymentEvent(event));
    }

    public void processPayment(String account, double amount) {
        System.out.printf("%nProcessing $%.2f for account [%s]...%n", amount, account);

        PaymentEvent.Status status = amount > SUSPICIOUS_THRESHOLD
                ? PaymentEvent.Status.SUSPICIOUS
                : PaymentEvent.Status.SUCCESS;

        notifyObservers(new PaymentEvent(account, amount, status));
    }

    public void failPayment(String account, double amount) {
        System.out.printf("%nFailing payment of $%.2f for account [%s]...%n", amount, account);
        notifyObservers(new PaymentEvent(account, amount, PaymentEvent.Status.FAILED));
    }
}
