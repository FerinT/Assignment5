package com.ferin.domain;


import com.ferin.services.DisplayScreen;

public abstract class ValidateClient {

    private static boolean validateClient(String cardNumber, String pin) {
         String cardNumber1 = "123";
         String pin1 = "pin";

        return (cardNumber1.equals(cardNumber) & pin1.equals(pin));
    }

    public static void isValid(String cardNumber, String pin) {
        if(validateClient(cardNumber, pin)) {
            DisplayScreen displayScreen = new DisplayScreen();
            displayScreen.displayMenu();
            displayScreen.getTransaction();
        }
        else
            System.out.println("invalid pin");
    }

}
