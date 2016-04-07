package com.ferin.factories.account;


import com.ferin.account.impl.Credit;
import com.ferin.account.impl.Savings;
import com.ferin.account.impl.Student;
import com.ferin.factories.account.AccountFactory;

public abstract class AccountFactoryImpl {

    public static AccountFactory getAccountType(String type)
    {
        if(type.equalsIgnoreCase("credit"))
            return new Credit();
        if(type.equalsIgnoreCase("savings"))
            return new Savings();
        if(type.equalsIgnoreCase("Student"))
            return new Student();
        else
        return null;
    }
}
