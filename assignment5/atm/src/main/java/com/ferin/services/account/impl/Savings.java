package com.ferin.services.account.impl;

import com.ferin.domain.Account;
import com.ferin.factories.account.AccountFactory;

public class Savings implements AccountFactory {
    public Account getAccount(String accountType) {
        Account account = new Account.Builder()
                .accountNumber("789")
                .accountType("Savings")
                .balance(7000)
                .limit(760)
                .build();
        return account;
    }
}
