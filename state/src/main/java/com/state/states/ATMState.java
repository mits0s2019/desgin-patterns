package com.state.states;

public interface ATMState {

    void insertCard();
    void insertPin(int pin);
    void withdraw(int cash);
    void ejectCard();
}
