package com.proxy;

public class UserService implements ITodo {

    public void method1(){
        System.out.println("method1");

    }
    public void method2(){
        System.out.println("method2");

    }

    @Override
    public void method3() {
        System.out.println("method3");
    }

    @Override
    public void method4() {
        System.out.println("method4");

    }

    @Override
    public void method5() {
        System.out.println("method5");

    }
}
