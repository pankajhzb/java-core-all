package com.pk.solid.O;

import com.pk.solid.L.Account;

import java.math.BigDecimal;

public class CurrentAccount extends Account {
    @Override
    protected void deposit(BigDecimal amount) {
    // Deposit into this account
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        // Withdraw from this account
    }
}
