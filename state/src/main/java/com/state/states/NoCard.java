package com.state.states;

import com.state.ATM;

public class NoCard implements ATMState {

    private ATM atm;

    public NoCard( ATM atm) {
        this.atm=atm;
    }

    public void insertCard() {
        System.out.println("Please insert PIN");
        atm.setAtmState(atm.getHasCard());
    }

    public void insertPin(int pin) {
        System.out.println("you have to insert the card first");
    }

    public void withraw(int cash) {
        System.out.println("you have to insert the card first");
    }

    @Override
    public void ejectCard() {
        System.out.println("There is no card to eject");
    }
}
