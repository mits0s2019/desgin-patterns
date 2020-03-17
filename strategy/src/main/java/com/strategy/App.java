package com.strategy;



public class App {

    public static void main(String[] args) {

        Fisherman fisherman=new Fisherman(new NetStrategy());
        fisherman.fish();

        fisherman.setFishingStrategy(new SpearStratedy());
        fisherman.fish();
    }
}
