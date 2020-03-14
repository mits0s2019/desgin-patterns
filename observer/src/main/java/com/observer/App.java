package com.observer;

import com.observer.observable.Mobile;
import com.observer.observable.MobileBrand;
import com.observer.observers.StockHouse1;
import com.observer.observers.StockHouse2;

public class App {

    public static void main(String[] args) {

        Mobile mobile=new Mobile(MobileBrand.SAMSUNG);

        mobile.registerObserver(new StockHouse1());
        mobile.registerObserver(new StockHouse2());

        mobile.search();
    }
}
