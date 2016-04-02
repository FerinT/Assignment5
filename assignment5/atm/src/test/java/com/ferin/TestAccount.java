package com.ferin;

import com.ferin.domain.Account;
import com.ferin.factories.account.AccountFactoryImpl;
import com.ferin.services.account.impl.Cheque;
import com.ferin.services.account.impl.Credit;
import com.ferin.services.account.impl.Savings;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAccount {

    Account account;

    @Test
    public void testBuilder() throws Exception {
        account = new Account.Builder()
                .limit(200)
                .balance(300)
                .accountType("credit")
                .accountNumber("123")
                .build();

        Assert.assertEquals(account.getBalance(), 300.0);
    }

    @Test
    public void testSavings() throws Exception {
        account = new AccountFactoryImpl().getAccount("Savings");
        Assert.assertSame(account.getClass(), new Savings().getAccount("savings").getClass());
    }

    @Test
    public void testCredit() throws Exception {
        account = new AccountFactoryImpl().getAccount("credit");
        Assert.assertSame(account.getClass(), new Credit().getAccount("credit").getClass());
    }

    @Test
    public void testCheque() throws Exception {
        account = new AccountFactoryImpl().getAccount("cheque");
        Assert.assertSame(account.getClass(), new Cheque().getAccount("credit").getClass());
    }

    @Test
    public void testDebit() throws Exception {
        account = new AccountFactoryImpl().getAccount("cheque");
        account.debit(200);
        Assert.assertEquals(account.getBalance(), 4800.0);
    }

    @Test
    public void testCreditMethod() throws Exception {
        account = new AccountFactoryImpl().getAccount("cheque");
        account.credit(1000);
        Assert.assertEquals(account.getBalance(), 6000.0);
    }
}
