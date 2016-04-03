package com.ferin.domain;


public class Bank {
    private String bankName;
    private String location;

    private Bank(){}

    private Bank(Builder builder)
    {
        this.bankName = builder.bankName;
        this.location = builder.location;
    }

    public String getBankName() {
        return bankName;
    }

    public String getLocation() {
        return location;
    }

    public void accessATM()
    {
        Atm.runAtm();
    }

    public static class Builder
    {
        private String bankName;
        private String location;

        public Builder bankName(String bankName)
        {
            this.bankName = bankName;
            return this;
        }

        public Builder location(String location)
        {
            this.location = location;
            return this;
        }

        public Builder copy(Bank bank)
        {
            this.bankName = bank.bankName;
            this.location = bank.location;
            return this;
        }

        public Bank build()
        {
            return new Bank(this);
        }
    }

}
