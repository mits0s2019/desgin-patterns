package com.state;

public class CreditCard {

    private int balance;
    private int pin;

    private  CreditCard(CreditCardBuilder creditCardBuilder) {
        this.balance=creditCardBuilder.balance;
        this.pin=creditCardBuilder.pin;
    }

    public static class CreditCardBuilder{
        private int balance;
        private int pin;

        public CreditCardBuilder withBalance(int balance){
           this.balance=balance;
           return this;
       }
        public CreditCardBuilder withPin(int pin){
            this.pin=pin;
            return this;
        }
        public CreditCard build(){
          return new CreditCard(this);
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "balance=" + balance +
                ", pin=" + pin +
                '}';
    }
}
