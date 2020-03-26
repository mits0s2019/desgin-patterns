package com.state.states;

public interface ATMState {

    void insertCard();
    void insertPin(int pin);
    void withraw(int cash);
    void ejectCard();
}
