package com.ferin.account.impl;


import com.ferin.account.Account;
import com.ferin.factories.account.AccountFactory;

public class Student implements AccountFactory {

    public Account getAccount(String accountNumber, double balance, double limit) {
        Account student = new Account.Builder()
                .accountType("student")
                .accountNumber(accountNumber)
                .balance(balance)
                .limit(limit)
                .fee(5.2)
                .build();
        return student;
    }

}
