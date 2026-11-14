package com.pk.design.behavioral.observer;

public interface PaymentSubject {
    void subscribe(PaymentObserver observer);
    void unsubscribe(PaymentObserver observer);
    void notifyObservers(PaymentEvent event);
}
