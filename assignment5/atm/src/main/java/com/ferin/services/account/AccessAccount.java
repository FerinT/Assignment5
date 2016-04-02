package com.ferin.services.account;

import com.ferin.domain.Account;
import com.ferin.factories.account.AccountFactory;
import com.ferin.factories.account.AccountFactoryImpl;
import com.ferin.services.account.impl.Cheque;
import com.ferin.services.account.impl.Credit;
import com.ferin.services.account.impl.Savings;

import java.util.Scanner;

public abstract class AccessAccount {

    public static Account displayAccountOptions()
    {
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        Account account = null;

        System.out.println("Please select an account : \n" + "1  - Cheque\n" + "2  - Credit\n" + "3  - Savings \n");
        option = scanner.nextInt();

        if(option == 1)
            account = new AccountFactoryImpl().getAccount("Cheque"); //new Cheque().getAccount("Cheque");
        if(option == 2)
            account = new AccountFactoryImpl().getAccount("Credit");
        if(option == 3)
            account = new AccountFactoryImpl().getAccount("Savings");

        return account;
    }

}
