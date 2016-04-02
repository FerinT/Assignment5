package com.ferin.factories.Client;


import com.ferin.domain.Client;

public interface ClientFactory {
    Client createClient(String cardNumber, String pin);
}
