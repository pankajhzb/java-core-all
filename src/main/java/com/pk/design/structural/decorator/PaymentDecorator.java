package com.pk.design.structural.decorator;

public abstract class PaymentDecorator implements PaymentService {

    protected final PaymentService delegate;

    protected PaymentDecorator(PaymentService delegate) {
        this.delegate = delegate;
    }
}
