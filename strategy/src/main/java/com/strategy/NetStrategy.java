package com.strategy;

public class NetStrategy implements FishingStrategy{
    @Override
    public void run() {
        System.out.println("Netting...");
    }
}
