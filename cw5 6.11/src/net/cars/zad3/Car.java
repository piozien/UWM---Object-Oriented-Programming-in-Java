package net.cars.zad3;

 class Car {
    private String brand;
    private String model;
    private int productionYear;

    public Car(){

    }
    public Car(String brand, String model){
        this.model = model;
        this.brand = brand;
    }
    public Car(String model, String brand, int productionYear){
        this.model = model;
        this.brand = brand;
        this.productionYear = productionYear;
    }
}
