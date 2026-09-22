package com.company;

import java.util.ArrayList;

public class RentalService {

    private ArrayList<Vehicle> vehicles;

    public RentalService() {
        this.vehicles = new ArrayList<>();
    }

    // اضافه کردن وسیله نقلیه
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // پیدا کردن وسیله بر اساس ID
    public Vehicle findVehicleById(int id) {

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getId() == id) {
                return vehicle;
            }
        }

        return null;
    }

    // نمایش وسایل موجود
    public void showAvailableVehicles() {

        System.out.println("===== AVAILABLE VEHICLES =====");

        for (Vehicle vehicle : vehicles) {

            if (vehicle.isAvailable()) {
                vehicle.displayInfo();
                System.out.println("--------------------");
            }
        }
    }

    // اجاره وسیله
    public void rentVehicle(int id) {

        Vehicle vehicle = findVehicleById(id);

        if (vehicle == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        if (!vehicle.isAvailable()) {
            System.out.println("Vehicle is not available.");
            return;
        }

        vehicle.rent();

        System.out.println("Vehicle rented successfully.");
    }

    // بازگرداندن وسیله
    public void returnVehicle(int id) {

        Vehicle vehicle = findVehicleById(id);

        if (vehicle == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        if (vehicle.isAvailable()) {
            System.out.println("Vehicle is already available.");
            return;
        }

        vehicle.returnVehicle();

        System.out.println("Vehicle returned successfully.");
    }

    // نمایش تمام وسایل
    public void showAllVehicles() {

        System.out.println("===== ALL VEHICLES =====");

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("--------------------");
        }
    }
}