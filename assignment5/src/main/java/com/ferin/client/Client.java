package com.ferin.client;


import java.io.Serializable;

public class Client implements Serializable{

    private static Client client = null;

    private String idNumber;
    private String name;
    private String memberShipType;

    private Client(){}

    private Client(Builder builder) {
        this.idNumber = builder.idNumber;
        this.name = builder.name;
        this.memberShipType = builder.memberShipType;
    }

    public Client getInstance()
    {
        if(client == null)
            client = new Client();
        return client;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getMembershipType() {
        return memberShipType;
    }

    public static class Builder
    {
        private String idNumber;
        private String name;
        private String memberShipType;

        public Builder idNumber(String value){
            this.idNumber = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder membershipType(String memberShipType){
            this.memberShipType = memberShipType;
            return this;
        }

        public Builder copy(Client client)
        {
            this.idNumber = client.idNumber;
            this.name = client.name;
            this.memberShipType = client.memberShipType;
            return this;
        }

        public Client build() {
            return new Client(this);
        }

    }
}
