package com.ferin;


import com.ferin.account.Account;
import com.ferin.factories.account.AccountFactoryImpl;

public abstract class AccessAccount {

    /* get account from DB using accNum */
    public static Account getAccount(String type)
    {
        return (Account)AccountFactoryImpl.getAccountType(type);
    }
}
