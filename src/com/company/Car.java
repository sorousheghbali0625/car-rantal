package com.company;

import com.sun.org.apache.xml.internal.utils.SuballocatedByteVector;

public class Car extends Vehicle{
    private int numberOfDoors;
    public Car(int numberOfDoors, int id, String model, String brand, double dailyPrice){
        super(id,model, brand, dailyPrice);
        this.numberOfDoors = numberOfDoors;

    }

    @Override
    public void displayInfo() {

        System.out.println(getModel() +"\n"+getBrand()+"\n"+getId());
    }
}
