package com.strategy;

public class Fisherman {

    private FishingStrategy fishingStrategy;

    public Fisherman(FishingStrategy fishingStrategy) {
        this.fishingStrategy = fishingStrategy;
    }

    public void setFishingStrategy(FishingStrategy fishingStrategy) {
        this.fishingStrategy = fishingStrategy;
    }

    public void fish(){
        fishingStrategy.run();
    }
}
