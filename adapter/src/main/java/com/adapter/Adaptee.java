package com.adapter;

import java.util.logging.Logger;

public class Adaptee {
    private static final Logger logger = Logger.getLogger(Adaptee.class.getName());

    public void display1(){

        logger.info("Hello from Adaptee class");
    }

}
