package com.pk.collection;

import java.util.Objects;

public class Money {
    int amount;
    String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass())
            return false;
        Money money = (Money)o;
        return amount == money.amount && Objects.equals(currencyCode, money.currencyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currencyCode);
    }

    public static void main(String[] args) {
        Money income = new Money(55, "USD");
        Money expenses = new Money(56, "USD");
        boolean balanced = income.equals(expenses);
        System.out.println("Is balanced amount matching with income after total expenses?: " + balanced);
    }
}


