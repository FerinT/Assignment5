package com.ferin.services.account.impl;


import com.ferin.domain.Account;
import com.ferin.factories.account.AccountFactory;

public class Cheque implements AccountFactory{
    public Account getAccount(String accountType) {
        Account account = new Account.Builder()
                .accountNumber("123")
                .accountType("Cheque")
                .balance(5000)
                .limit(500)
                .build();
        return account;
    }
}
