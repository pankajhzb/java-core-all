package com.pk.solidPrinciple.L;

import java.math.BigDecimal;

public class L_APP {
    public static void main(String[] args) {
        Account myFixedTermDepositAccount = new FixedTermDepositAccount();
        myFixedTermDepositAccount.deposit(new BigDecimal("1000.00"));

        BankingAppWithdrawalService withdrawalService = new BankingAppWithdrawalService(myFixedTermDepositAccount);
        withdrawalService.withdraw(new BigDecimal("100.00"));

        // Updated, follows Liskov principle.
        Account_Updated myFixedTermDepositAccount_u = new FixedTermDepositAccount_Updated();
        myFixedTermDepositAccount_u.deposit(new BigDecimal("1000.00"));

        // Withdrawal not applicable for fixed deposit account and extended method also have no withdrawal method.
        /*BankingAppWithdrawalService withdrawalService = new BankingAppWithdrawalService(myFixedTermDepositAccount);
        withdrawalService.withdraw(new BigDecimal("100.00"));*/

        //Withdrawal applicable for saving and current account
        WithdrawableAccount savingAccount_updated = new SavingAccount_Updated();
        savingAccount_updated.deposit(new BigDecimal("1000.00"));
        BankingAppWithdrawalService_Updated withdrawalService_u = new BankingAppWithdrawalService_Updated(savingAccount_updated);
        withdrawalService_u.withdraw(new BigDecimal("100.00"));

    }
}
