package com.state;

import com.state.states.ATMState;
import com.state.states.HasCard;
import com.state.states.PinCorrect;
import com.state.states.NoCard;

public class ATM {

    private ATMState currentState;

    private ATMState hasCard;
    private ATMState noCard;
    private ATMState pinCorrect;

    private CreditCard creditCard;

    public ATM(CreditCard creditCard) {
        this.hasCard = new HasCard(this);
        this.noCard= new NoCard(this);
        this.pinCorrect = new PinCorrect(this);

        this.creditCard=creditCard;

        this.currentState = noCard;
    }

    public void setAtmState(ATMState atmState) {
        this.currentState = atmState;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void insertPin(int pin) {
        currentState.insertPin(pin);
    }

    public void withdraw(int cash) {
        currentState.withdraw(cash);
    }
    public void ejectCard() {
        currentState.ejectCard();
    }

    public ATMState getPinCorrect() {
        return pinCorrect;
    }

    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getNoCard() {
        return noCard;
    }


    public ATMState getCurrentState() {
        return currentState;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }
}
