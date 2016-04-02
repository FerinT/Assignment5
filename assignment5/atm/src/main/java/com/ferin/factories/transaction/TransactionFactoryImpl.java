package com.ferin.factories.transaction;

import com.ferin.domain.Account;
import com.ferin.domain.Transaction;
import com.ferin.services.account.AccessAccount;
import com.ferin.services.transaction.TransactionChain;
import com.ferin.services.transaction.impl.BalanceEnquiry;
import com.ferin.services.transaction.impl.Deposit;
import com.ferin.services.transaction.impl.Withdraw;

public class TransactionFactoryImpl implements TransactionFactory {

    private Transaction transaction = null;

    private static TransactionFactoryImpl transactionFactory = null;

    public static TransactionFactoryImpl getInstance(){
        if(transactionFactory ==null)
            transactionFactory = new TransactionFactoryImpl();
        return transactionFactory;
    }

    public Transaction getTransaction(String transactionType) {

        Account account = AccessAccount.displayAccountOptions();

        if (transactionType.equalsIgnoreCase("balanceEnquiry")) {
            transaction = new BalanceEnquiry().getTransaction(account); // need to pass through account object
        }

        if (transactionType.equalsIgnoreCase("Withdraw")) {
            transaction = new Withdraw().getTransaction(account);
        }

        if (transactionType.equalsIgnoreCase("deposit")) {
            transaction = new Deposit().getTransaction(account);
        }

        return transaction;
    }

    public static String getTransaction(int value){
        TransactionChain chain = setUpChain();
        return chain.handleRequest(value);
    }

    public static TransactionChain setUpChain(){
        TransactionChain balanceEnquiry = new BalanceEnquiry();
        TransactionChain deposit = new Deposit();
        TransactionChain withdraw = new Withdraw();
        balanceEnquiry.setNextTransaction(deposit);
        deposit.setNextTransaction(withdraw);
        return balanceEnquiry;

    }

}

