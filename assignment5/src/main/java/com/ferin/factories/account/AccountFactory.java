package com.ferin.factories.account;

import com.ferin.account.Account;

public interface AccountFactory {
    Account getAccount(String accountNumber, double balance, double limit);
}
