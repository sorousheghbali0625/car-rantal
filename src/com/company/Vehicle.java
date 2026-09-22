package com.company;

 class Vehicle implements Rentable{
    private int id;
    private String brand;
    private String model;
    private double dailyPrice;
    private boolean available;

    public Vehicle(int id, String brand, String model, double dailyPrice){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.dailyPrice = dailyPrice;
    }
    public int getId(){
        return id;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public double getDailyPrice(){
        return dailyPrice;
    }
    public void displayInfo(){
        System.out.println(id + "\n"+brand+"\n"+model+"\n");
    }
    public void calculateRent(int days){
        System.out.println(days * dailyPrice);
    }
     public boolean isAvailable() {
         return available;
     }

     @Override
     public void rent() {

     }

     @Override
     public void returnVehicle() {

     }
 }
