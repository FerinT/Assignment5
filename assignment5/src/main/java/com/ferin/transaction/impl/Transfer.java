package com.ferin.transaction.impl;


import com.ferin.transaction.Transaction;

public class Transfer extends Transaction {

    @Override
    public Transaction handleRequest(String request) {
        if(request.equalsIgnoreCase("transfer")) {

            return  new Transfer();//transfer();
        }
        else{
            if (nextTransaction != null) {
               return nextTransaction.handleRequest(request);
            }
        }
        return null;
    }

    public String transfer()
    {
        return "transfer";
    }
}
