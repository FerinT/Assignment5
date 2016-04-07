package com.ferin;

import com.ferin.factories.tranaction.TransactionFactory;
import com.ferin.transaction.impl.BalanceEnquiry;
import com.ferin.transaction.impl.Transfer;
import com.ferin.transaction.impl.Withdraw;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTransaction {
    @Test
    public void testWithdraw() throws Exception {
        Assert.assertEquals(TransactionFactory.getTransaction("withdraw").getClass(), new Withdraw().getClass());
    }
    @Test
    public void testTransfer() throws Exception {
        Assert.assertEquals(TransactionFactory.getTransaction("transfer").getClass(), new Transfer().getClass());
    }
    @Test
    public void testBalanceEnquiry() throws Exception {
        Assert.assertEquals(TransactionFactory.getTransaction("balanceEnquiry").getClass(), new BalanceEnquiry().getClass());
    }
}
