package com.company;

import java.util.TreeMap;

public class LuxuryCar extends Car {
    private boolean hasDriver;
    public LuxuryCar(int id , String brand, String model, double dailyPrice, int numberOfDoors, boolean hasDriver){
        super(numberOfDoors, id, model, brand, dailyPrice);
        this.hasDriver = hasDriver;

    }


    @Override
    public void calculateRent(int days) {
        if (hasDriver == true)
            System.out.println(days * getDailyPrice()+ 2000000);
        else {
            System.out.println(getDailyPrice()* days);
        }
    }

}
