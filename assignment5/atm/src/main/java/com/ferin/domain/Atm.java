package com.ferin.domain;


import com.ferin.factories.Client.ClientFactoryImpl;
import com.ferin.factories.Client.ClientFactory;

import java.util.Scanner;

public abstract class Atm {

    static Scanner scanner = new Scanner(System.in);
    static ClientFactory clientFactory = new ClientFactoryImpl();

    public static void runAtm() {

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
