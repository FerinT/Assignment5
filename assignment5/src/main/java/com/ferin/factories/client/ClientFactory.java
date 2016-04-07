package com.ferin.factories.client;

import com.ferin.client.Client;

public interface ClientFactory {
    Client getClient(String idNumber, String name);
}
