package com.pk.solidPrinciple.O;


import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private SavingAccount savingAccount;
    private CurrentAccount currentAccount;
    // if new account like FixedTermDeposit account introduced then
    // this class need to update
    public BankingAppWithdrawalService(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public BankingAppWithdrawalService(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }

    public void savingAccountWithdraw(BigDecimal amount) {
        savingAccount.withdraw(amount);
    }

    public void currentAccountWithdraw(BigDecimal amount) {
        currentAccount.withdraw(amount);
    }
}
