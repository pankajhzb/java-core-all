package com.pk.solid.O;


import java.math.BigDecimal;

public class BankingAppWithdrawalService_updated {
    private final Account account;

    public BankingAppWithdrawalService_updated(Account account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}
