package com.company;

public class MotorCycle extends  Vehicle{
    private int engineCC;
    public MotorCycle(int id, String brand , String model, double dailyPrice, int engineCC){
        super(id, brand, model, dailyPrice);
        this.engineCC = engineCC;
    }

    @Override
    public void displayInfo() {
        System.out.println(getId() + getBrand()+ getModel());
    }

}
