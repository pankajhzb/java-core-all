package com.pk.solid.O;

import java.math.BigDecimal;

public class OCP_APP {
    public static void main(String[] args) {
new BankingAppWithdrawalService(new SavingAccount()).savingAccountWithdraw(BigDecimal.valueOf(11.00));
new BankingAppWithdrawalService(new CurrentAccount()).currentAccountWithdraw(BigDecimal.valueOf(12.00));
    }
}
