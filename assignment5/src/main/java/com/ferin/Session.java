package com.ferin;


import com.ferin.factories.tranaction.TransactionFactory;

import java.util.Scanner;

public abstract class Session {

    private Scanner scanner = new Scanner(System.in);
    private String transactionSelection;
    private String opt;

    public  void selectTranaction()
    {
        System.out.println("Please select a transaction :\n"+"1   - Balance Enquiry\n" + "2   - Deposit\n" + "3   - Withdraw\n" + "4  - Exit\n");
        System.out.println("Please select an option : ");
        opt = scanner.nextLine();

        TransactionFactory.getTransaction(opt);
    }
}
