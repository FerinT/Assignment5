package com.ferin.transaction.impl;

import com.ferin.transaction.Transaction;


public class Withdraw extends Transaction {

    @Override
    public Transaction handleRequest(String request) {
        if(request.equalsIgnoreCase("withdraw")) {
             return new Withdraw();//withdraw();
        }
        else{
            if (nextTransaction != null) {
                return nextTransaction.handleRequest(request);
            }
        }
        return null;
    }

    public String withdraw()
    {
        return "withdraw";
    }
}
