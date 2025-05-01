package com.pk.solidPrinciple.O;


import java.math.BigDecimal;

public class BankingAppWithdrawalService_updated {
    private final Account account;

    public BankingAppWithdrawalService_updated(Account account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }

    public void deposit(BigDecimal amount) {
        account.deposit(amount);
    }
}
