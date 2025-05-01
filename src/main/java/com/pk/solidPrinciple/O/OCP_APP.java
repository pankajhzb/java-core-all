package com.pk.solidPrinciple.O;

import java.math.BigDecimal;

public class OCP_APP {
    public static void main(String[] args) {
        // non OCP principle
        new BankingAppWithdrawalService(new SavingAccount()).savingAccountWithdraw(BigDecimal.valueOf(11.00));
        new BankingAppWithdrawalService(new CurrentAccount()).currentAccountWithdraw(BigDecimal.valueOf(12.00));

        // OCP principle
        //Account account = new SavingAccount();
        //new BankingAppWithdrawalService_updated(account).withdraw(BigDecimal.valueOf(11.00));
        //new BankingAppWithdrawalService_updated(account).deposit(BigDecimal.valueOf(11.00));



    }
}
