package com.ferin;

import com.ferin.domain.Bank;

public class Run {
    public static void main(String[] args) {
        Bank bank = new Bank.Builder()
                .build();
        bank.accessATM();
    }
}
