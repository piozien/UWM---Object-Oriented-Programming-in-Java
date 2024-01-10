package Programowanie_Generyczne.zad22;

public class ElectricCar extends Car{
    private boolean electric;


    public ElectricCar(String model, String type) {
        super(model, type);
        this.electric = true;
    }

}
