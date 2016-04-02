package com.ferin;

import com.ferin.domain.Transaction;
import com.ferin.factories.transaction.TransactionFactoryImpl;
import com.ferin.services.transaction.TransactionChain;
import com.ferin.services.transaction.impl.Deposit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTransaction {

    Transaction transaction;

    @Test
    public void testDeposit() throws Exception {
        Assert.assertEquals(TransactionFactoryImpl.getTransaction(2), "deposit");
    }

    @Test
    public void testWithdraw() throws Exception {
        Assert.assertEquals(TransactionFactoryImpl.getTransaction(3), "withdraw");
    }

    @Test
    public void testBalanceEnq() throws Exception {
        Assert.assertEquals(TransactionFactoryImpl.getTransaction(1), "balanceEnquiry");
    }

    @Test
    public void testChain() throws Exception {
        TransactionChain chain = new Deposit(); // new withdraw to fail
        Assert.assertEquals(chain.handleRequest(2), "deposit");
    }

    @Test
    public void testTransaction() throws Exception {
        transaction = new Transaction.Builder()
                .transactionNumber("852")
                .transactionType("741")
                .build();
        Assert.assertEquals(transaction.getTransactionNumber(), "852");
    }

    @Test
    public void testNullness() throws Exception {
        transaction = new Transaction.Builder()
                .transactionNumber("852")
                .build();
        Assert.assertEquals(transaction.getTransactionType(), null);
    }
}
