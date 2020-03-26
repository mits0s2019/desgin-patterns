package com.state;

public class App {

    public static void main(String[] args) {

        CreditCard creditCard= new CreditCard.CreditCardBuilder()
                .withPin(1234)
                .withBalance(4000)
                .build();

        ATM atm=new ATM(creditCard);

        atm.insertCard();
        atm.insertPin(1234);
        atm.withraw(1000);
        atm.ejectCard();

    }
}
