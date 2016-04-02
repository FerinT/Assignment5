package com.ferin.services.account.impl;


import com.ferin.domain.Account;
import com.ferin.factories.account.AccountFactory;

public class Credit implements AccountFactory {
    public Account getAccount(String accountType) {
        Account account = new Account.Builder()
                .accountNumber("456")
                .accountType("Credit")
                .balance(6000)
                .limit(650)
                .build();
        return account;
    }
}
