package com.ferin;


import com.ferin.account.Account;
import com.ferin.account.impl.Credit;
import com.ferin.account.impl.Student;
import com.ferin.factories.account.AccountFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAccount {

    @Test
    public void testClassOrigin() throws Exception {
        Assert.assertEquals(AccountFactoryImpl.getAccountType("credit").getClass(), new Credit().getClass());
    }

    @Test
    public void testChange() throws Exception {
        Account account = AccountFactoryImpl.getAccountType("savings").getAccount("123", 250.3,200.0);
        Account account2 = new Account.Builder()
                .copy(account)
                .accountType("credit")
                .build();
        account = account2;
        Assert.assertEquals(account.getAccountType(), "credit");
    }

    @Test
    public void testNull() throws Exception {
        Account account = AccountFactoryImpl.getAccountType("savings").getAccount("123", 250.3,200.0);
        Assert.assertNotNull(account = account.getInstance());

    }

    @Test
    public void testStudent() throws Exception {
        Assert.assertEquals(AccountFactoryImpl.getAccountType("student").getClass(), new Student().getClass());
    }
}
