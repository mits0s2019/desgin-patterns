package com.state.states;

import com.state.ATM;

public class HasCard implements ATMState {


    private ATM atm;

    public HasCard( ATM atm) {
        this.atm=atm;
    }

    public void insertCard() {
        System.out.println("you have already inserted your card");
    }

    public void insertPin(int pin) {
        if(pin==atm.getCreditCard().getPin()){
            System.out.println("Pin OK ...");
            atm.setAtmState(atm.getPinCorrect());
        }
        else{
            System.out.println("wrong pin");
        }
    }

    public void withdraw(int cash) {
        System.out.println("you have to insert your pin first");
    }

    @Override
    public void ejectCard() {
        System.out.println("card ejected");
        atm.setAtmState(atm.getNoCard());
    }
}
