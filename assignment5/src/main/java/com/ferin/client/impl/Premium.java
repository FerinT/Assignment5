package com.ferin.client.impl;


import com.ferin.client.Client;
import com.ferin.factories.client.ClientFactory;

public class Premium implements ClientFactory {

    public Client getClient(String idNumber, String name) {
        Client premium = new Client.Builder()
                .idNumber(idNumber)
                .name(name)
                .membershipType("premium")
                .build();
        return premium;
    }
}
