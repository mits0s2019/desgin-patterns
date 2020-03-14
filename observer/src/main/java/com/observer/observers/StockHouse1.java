package com.observer.observers;

import com.observer.observable.MobileBrand;

import java.util.HashMap;
import java.util.Map;

public class StockHouse1 implements Observer {

    private static Map<MobileBrand,Integer> stocks;

    static{
        stocks=new HashMap<>();
        stocks.put(MobileBrand.APPLE,5);
        stocks.put(MobileBrand.NOKIA,0);
        stocks.put(MobileBrand.SAMSUNG,1);
        stocks.put(MobileBrand.XIAOMI,2);
    }

    public void update(MobileBrand mobileBrand) {

        stocks.forEach((k,v)->{
            if(k==mobileBrand){
                System.out.println(StockHouse2.class.getSimpleName()+" has : "+v+" " + k +" mobiles");
            }
        });
    }
}
