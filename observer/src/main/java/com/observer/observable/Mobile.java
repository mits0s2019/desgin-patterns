package com.observer.observable;

import com.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;


public class Mobile implements Observable {

    private MobileBrand mobileBrand;
    private List<Observer> observers;

    public Mobile(MobileBrand mobileBrand) {
        this.mobileBrand = mobileBrand;
        observers=new ArrayList<Observer>();

    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer ob :observers){
            ob.update(mobileBrand);
        }
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void search(){
        System.out.println("Searching for "+mobileBrand);
        System.out.println("********************");
        notifyObservers();
    }
}
