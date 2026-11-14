package com.pk.design.behavioral.observer;

public class EmailNotificationObserver implements PaymentObserver {

    @Override
    public void onPaymentEvent(PaymentEvent event) {
        System.out.printf("[EMAIL] Sending notification to account [%s]: Payment of $%.2f — %s%n",
                event.getAccount(), event.getAmount(), event.getStatus());
    }
}
