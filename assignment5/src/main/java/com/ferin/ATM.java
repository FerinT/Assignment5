package com.ferin;


public class ATM {

    private String location;
    private double cashOnHand;

    private static  ATM atm = null;

    private ATM(){}

    private ATM(Builder builder)
    {
        this.cashOnHand = builder.cashOnHand;
        this.location = builder.location;
    }

    public ATM getInstance()
    {
        if(atm == null)
            atm = new ATM();
        return atm;
    }

    public String getLocation() {
        return location;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public static class Builder
    {
        private String location;
        private double cashOnHand;

        public Builder location(String location)
        {
            this.location = location;
            return this;
        }

        public Builder cashOnHand(double cashOnHand)
        {
            this.cashOnHand = cashOnHand;
            return this;
        }

        public Builder copy(ATM atm)
        {
            this.cashOnHand = atm.cashOnHand;
            this.location = atm.location;
            return this;
        }

        public ATM build()
        {
            return new ATM(this);
        }
    }
}
