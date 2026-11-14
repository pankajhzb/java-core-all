package com.pk.design.behavioral.observer;

public class FraudAlertObserver implements PaymentObserver {

    @Override
    public void onPaymentEvent(PaymentEvent event) {
        if (event.getStatus() == PaymentEvent.Status.SUSPICIOUS) {
            System.out.printf("[FRAUD ALERT] Suspicious payment of $%.2f detected on account [%s] at %s%n",
                    event.getAmount(), event.getAccount(), event.getTimestamp());
        }
    }
}
