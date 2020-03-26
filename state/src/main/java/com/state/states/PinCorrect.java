package com.state.states;

import com.state.ATM;

public class PinCorrect implements ATMState {

    private ATM atm;

    public PinCorrect(ATM atm) {
        this.atm=atm;
    }
    public void insertCard() {
        System.out.println("your card is inserted");
    }

    public void insertPin(int pin) {
        System.out.println("You already entered a PIN");

    }

    public void withraw(int cash) {
        if(atm.getCreditCard().getBalance()>=cash){
            int newBalance=atm.getCreditCard().getBalance()-cash;
            atm.getCreditCard().setBalance(newBalance);
            System.out.println("You successfully withdrawed "+cash+" \u20ac");
            System.out.println("Your new balance is "+newBalance+" \u20ac");
        }
        else{
            System.out.println("you cant withdraw");
            System.out.println("your balance is only "+atm.getCreditCard().getBalance()+" \u20ac");
        }
    }

    @Override
    public void ejectCard() {
        System.out.println("card ejected");
        atm.setAtmState(atm.getNoCard());
    }
}
