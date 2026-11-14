package com.pk.design.behavioral.observer;

import java.time.LocalDateTime;

public class PaymentEvent {

    public enum Status { SUCCESS, FAILED, SUSPICIOUS }

    private final String account;
    private final double amount;
    private final Status status;
    private final LocalDateTime timestamp;

    public PaymentEvent(String account, double amount, Status status) {
        this.account = account;
        this.amount = amount;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }

    public String getAccount()    { return account; }
    public double getAmount()     { return amount; }
    public Status getStatus()     { return status; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
