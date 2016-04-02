package com.ferin.domain;


import java.io.Serializable;

public class Client implements Serializable{

    private String idNumber;
    private String name;
    private String pin;
    private String cardNumber;

    private Client(){}

    private Client(Builder builder) {
        this.idNumber = builder.idNumber;
        this.name = builder.name;
        this.pin = builder.pin;
        this.cardNumber = builder.cardNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getPin() {
        return pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public static class Builder
    {
        private String idNumber;
        private String name;
        private String pin;
        private String cardNumber;

        public Builder idNumber(String value){
            this.idNumber = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder pin(String value){
            this.pin = value;
            return this;
        }

        public Builder cardNumber(String value){
            this.cardNumber = value;
            return this;
        }

        public Client build() {
            return new Client(this);
        }

    }

}
