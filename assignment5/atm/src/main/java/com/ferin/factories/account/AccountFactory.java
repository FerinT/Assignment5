package com.ferin.factories.account;

import com.ferin.domain.Account;

public interface AccountFactory {
    Account getAccount(String accountType);
}
