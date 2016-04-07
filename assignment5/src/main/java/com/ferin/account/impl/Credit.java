package com.ferin.account.impl;


import com.ferin.account.Account;

import com.ferin.factories.account.AccountFactory;

public class Credit implements AccountFactory {

    public Account getAccount(String accountNumber, double balance, double limit) {
        Account credit = new Account.Builder()
                .fee(20.50)
                .accountNumber(accountNumber)
                .balance(balance)
                .limit(limit)
                .accountType("credit")
                .build();
        return credit;
    }
}
