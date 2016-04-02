package com.ferin.domain;


import com.ferin.Menu;

public abstract class ValidateClient {

    private static boolean validateClient(String cardNumber, String pin) {
         String cardNumber1 = "123";
         String pin1 = "pin";

        return (cardNumber1.equals(cardNumber) & pin1.equals(pin));
    }

    public static void isValid(String cardNumber, String pin) {
        if(validateClient(cardNumber, pin)) {
            Menu menu = new Menu();
            menu.displayMenu();
            menu.getTransaction();
        }
        else
            System.out.println("invalid pin");
    }

}
