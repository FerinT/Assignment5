package com.ferin.client.impl;


import com.ferin.client.Client;
import com.ferin.factories.client.ClientFactory;

public class Business implements ClientFactory{

    public Client getClient(String idNumber, String name) {
        Client business = new Client.Builder()
                .idNumber(idNumber)
                .name(name)
                .membershipType("Business")
                .build();
        return business;
    }
}
