package com.ferin.factories.Client;


import com.ferin.domain.Client;

public class ClientFactoryImpl implements ClientFactory {

    private static ClientFactoryImpl clientFactoryImpl = null;

    public static ClientFactoryImpl getInstance(){
        if(clientFactoryImpl == null)
            clientFactoryImpl = new ClientFactoryImpl();
        return clientFactoryImpl;
    }

    public Client createClient(String cardNumber, String pin)
    {
        Client client = new Client.Builder()
                .cardNumber(cardNumber)
                .idNumber("123")
                .pin(pin)
                .name("Ferin")
                .build();
        return client;
    }
}
