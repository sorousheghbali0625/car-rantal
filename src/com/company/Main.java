package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RentalService service = new RentalService();

        service.addVehicle(new Car(2, 1234, "1234", "benz", 1000000));
        service.addVehicle(new LuxuryCar(2, "1234", "1234", 122222, 1000000, true));
        service.addVehicle(new MotorCycle(23, "honda", "125", 33000, 125));

        service.showAvailableVehicles();

        service.rentVehicle(2);

        service.returnVehicle(2);
    }
}
