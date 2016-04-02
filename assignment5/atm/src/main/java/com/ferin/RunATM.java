package com.ferin;


import com.ferin.domain.Client;
import com.ferin.domain.ValidateClient;
import com.ferin.factories.Client.ClientFactoryImpl;
import com.ferin.factories.Client.ClientFactory;

import java.util.Scanner;

public abstract class RunATM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ClientFactory clientFactory = new ClientFactoryImpl();

        while(true) {
            System.out.println("Please enter your card number (123)");
            String cardNumber = scanner.nextLine();

            System.out.println("Please enter your pin (pin)");
            String pin = scanner.nextLine();

            Client client = clientFactory.createClient(cardNumber, pin);

            ValidateClient.isValid(client.getCardNumber(), client.getPin());
        }

    }
}
