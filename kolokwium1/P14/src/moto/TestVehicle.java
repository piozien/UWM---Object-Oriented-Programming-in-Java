package moto;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = Vehicle.createCar("Mercedes","C", 2020 );
        Vehicle moto = new Vehicle();
        moto =  moto.createVehicle("Honda", "CBR", 2019);
    }
}
