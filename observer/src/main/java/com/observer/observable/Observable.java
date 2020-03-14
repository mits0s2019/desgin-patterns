package com.observer.observable;


import com.observer.observers.Observer;

public interface Observable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
    public void removeObserver(Observer observer);
}
