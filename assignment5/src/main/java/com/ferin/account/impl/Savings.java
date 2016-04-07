package com.ferin.account.impl;


import com.ferin.account.Account;
import com.ferin.factories.account.AccountFactory;

public class Savings implements AccountFactory {

    public Account getAccount(String accountNumber, double balance, double limit) {
        Account savings = new Account.Builder()
                .accountType("savings")
                .accountNumber(accountNumber)
                .balance(balance)
                .limit(limit)
                .fee(50.30)
                .build();
        return savings;
    }
}
