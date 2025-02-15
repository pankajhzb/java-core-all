package com.pk.solid.L;

import java.math.BigDecimal;

public class FixedTermDepositAccount_Updated extends Account_Updated {
    @Override
    protected void deposit(BigDecimal amount) {
    // Deposit into this account
    }

    /*@Override
    protected void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount!!");
    }*/
}
