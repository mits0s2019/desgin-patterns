package com.adapter;

public class App {


    public static void main(String[] args) {

        Mobile mobile=new Mobile(new AdapterUi());
        mobile.display();
    }
}
