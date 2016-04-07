package com.ferin.client.impl;


import com.ferin.client.Client;
import com.ferin.factories.client.ClientFactory;

public class Standard implements ClientFactory {

    public Client getClient(String idNumber, String name) {
        Client standard = new Client.Builder()
                .idNumber(idNumber)
                .name(name)
                .membershipType("standard")
                .build();
        return standard;
    }
}
