package moto;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    private Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public Vehicle(){

    }

    public static Vehicle createCar(String brand, String model, int year) {
        return new Vehicle(brand, model, year);
    }

    public Vehicle createVehicle(String brand, String model, int year) {
        return new Vehicle(brand, model, year);
    }
}
