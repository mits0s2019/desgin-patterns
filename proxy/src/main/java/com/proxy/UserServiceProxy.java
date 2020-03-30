package com.proxy;

public class UserServiceProxy implements ITodo {


    @Override
    public void method3() {
        UserService userService=new UserService();
        userService.method3();
    }

    @Override
    public void method4() {
        UserService userService=new UserService();
        userService.method4();
    }

    @Override
    public void method5() {
        UserService userService=new UserService();
        userService.method5();
    }
}
