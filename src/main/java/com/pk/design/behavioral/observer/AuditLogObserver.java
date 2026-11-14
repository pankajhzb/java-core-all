package com.pk.design.behavioral.observer;

public class AuditLogObserver implements PaymentObserver {

    @Override
    public void onPaymentEvent(PaymentEvent event) {
        System.out.printf("[AUDIT LOG] account=%s | amount=$%.2f | status=%s | time=%s%n",
                event.getAccount(), event.getAmount(), event.getStatus(), event.getTimestamp());
    }
}
