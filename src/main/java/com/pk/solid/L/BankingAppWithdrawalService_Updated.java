package com.pk.solid.L;

import java.math.BigDecimal;

public class BankingAppWithdrawalService_Updated {
    private WithdrawableAccount account;

    public BankingAppWithdrawalService_Updated(WithdrawableAccount account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}
