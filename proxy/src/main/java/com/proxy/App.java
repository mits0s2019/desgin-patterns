package com.proxy;

public class App {



    public static void main(String[] args) {

        ITodo iTodo=new UserServiceProxy();

        iTodo.method3();
        iTodo.method4();
        iTodo.method5();
    }
}
