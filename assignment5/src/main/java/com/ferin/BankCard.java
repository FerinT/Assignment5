package com.ferin;


import java.util.Date;

public class BankCard {
    private String cardNumber;
    private Date expiryDate;

    private static BankCard bankCard = null;

    private BankCard(){}

    private BankCard(Builder builder)
    {
        this.cardNumber = builder.cardNumber;
        this.expiryDate = builder.expiryDate;
    }

    public BankCard getInstance()
    {
        if(bankCard == null)
            bankCard = new BankCard();
        return bankCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public static class Builder
    {
        private String cardNumber;
        private Date expiryDate;

        public Builder cardNumber(String cardNumber)
        {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder expiryDate(Date expiryDate)
        {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder copy(BankCard bankCard)
        {
            this.expiryDate = bankCard.expiryDate;
            this.cardNumber = bankCard.cardNumber;
            return this;
        }

        public BankCard build()
        {
            return new BankCard(this);
        }
    }
}
