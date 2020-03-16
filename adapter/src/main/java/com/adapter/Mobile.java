package com.adapter;

public class Mobile {

    private UiInterface uiInterface ;

    public Mobile(UiInterface uiInterface) {
        this.uiInterface = uiInterface;
    }

    public void display(){
        uiInterface.display();
    }
}
