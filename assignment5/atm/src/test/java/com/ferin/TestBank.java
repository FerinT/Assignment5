package com.ferin;


import com.ferin.domain.Bank;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBank {

    @Test
    public void testObjectCreation() throws Exception {
        Bank bank = new Bank.Builder()
                .bankName("absa")
                .location("cpt")
                .build();

        Assert.assertEquals(bank.getLocation(), "cpt");
    }

    @Test
    public void testObjectCopy() throws Exception {
        Bank bank = new Bank.Builder()
                .bankName("absa")
                .location("cpt")
                .build();

        Bank bankCopy = new Bank.Builder()
                .copy(bank)
                .build();

        Assert.assertEquals(bank.getLocation(), bankCopy.getLocation());
    }

    @Test
    public void testObjectChange() throws Exception {
        Bank bank = new Bank.Builder()
                .bankName("absa")
                .location("cpt")
                .build();

        Bank bankCopy = new Bank.Builder()
                .copy(bank)
                .location("jhb")
                .build();

        Assert.assertEquals(bankCopy.getLocation(), "jhb");
    }
}
