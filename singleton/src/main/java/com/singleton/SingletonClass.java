package com.singleton;

/**
 * Singleton with the use of an Inner class.
 * It creates the instance only when someone calls the getInstance() method and not when the outer class is loaded.
 */
public class SingletonClass {

    private SingletonClass() {}

    private static class SingletonHolder {
        public static final SingletonClass instance = new SingletonClass();
    }

    public static SingletonClass getInstance() {
        return SingletonHolder.instance;
    }
}
