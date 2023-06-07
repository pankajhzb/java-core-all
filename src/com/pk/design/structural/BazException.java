package com.pk.design.structural;

public class BazException extends Exception {
    private String message;

    public BazException(String message) {
        super();
        this.message = message;
    }
}
