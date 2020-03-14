package com.observer.observers;

import com.observer.observable.MobileBrand;

import java.util.HashMap;
import java.util.Map;

public class StockHouse2 implements Observer{

    private static Map<MobileBrand,Integer> stocks;

    static{
        stocks=new HashMap<>();
        stocks.put(MobileBrand.APPLE,8);
        stocks.put(MobileBrand.NOKIA,4);
        stocks.put(MobileBrand.SAMSUNG,0);
        stocks.put(MobileBrand.XIAOMI,5);
    }

    public void update(MobileBrand mobileBrand) {

        stocks.forEach((k,v)->{
            if(k==mobileBrand){
                System.out.println(StockHouse2.class.getSimpleName()+" has : "+v+" " + k +" mobiles");
            }
        });
    }
}
