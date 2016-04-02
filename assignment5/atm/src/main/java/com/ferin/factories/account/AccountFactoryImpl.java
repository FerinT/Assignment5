package com.ferin.factories.account;

import com.ferin.domain.Account;
import com.ferin.services.account.impl.Cheque;
import com.ferin.services.account.impl.Credit;
import com.ferin.services.account.impl.Savings;

public class AccountFactoryImpl implements AccountFactory{

    private static AccountFactoryImpl accountFactory = null;
    private Account account;

    public static AccountFactoryImpl getInstance(){
        if(accountFactory == null)
            accountFactory = new AccountFactoryImpl();
        return accountFactory;
    }

    public Account getAccount(String accountType) {
        if(accountType.equalsIgnoreCase("credit"))
            account = new Credit().getAccount("credit");
        if(accountType.equalsIgnoreCase("cheque"))
            account = new Cheque().getAccount("cheque");
        if(accountType.equalsIgnoreCase("Savings"))
            account = new Savings().getAccount("savings");
        return account;
    }
}
