package com.ferin.factories.transaction;


import com.ferin.domain.Transaction;

public interface TransactionFactory {
    Transaction getTransaction(String transactionType);
}
