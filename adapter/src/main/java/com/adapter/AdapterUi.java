package com.adapter;

public class AdapterUi implements UiInterface{

    private Adaptee adaptee;

    public AdapterUi() {
        this.adaptee = new Adaptee();
    }

    public void display() {
        adaptee.display1();
    }
}
