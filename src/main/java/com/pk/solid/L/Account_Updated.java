package com.pk.solid.L;

import java.math.BigDecimal;

public abstract class Account_Updated {
    protected abstract void deposit(BigDecimal amount);

    /**
     * Reduces the balance of the account by the specified amount
     * provided given amount > 0 and account meets minimum available
     * balance criteria.
     *
     * @param amount
     */
    //protected abstract void withdraw(BigDecimal amount);
}
