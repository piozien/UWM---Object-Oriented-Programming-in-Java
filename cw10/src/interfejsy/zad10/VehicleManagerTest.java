package interfejsy.zad10;

public class VehicleManagerTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.startEngine());
        System.out.println(c1.getFuelLevel());
        Motorcykle m1 = new Motorcykle();
        System.out.println(m1.startEngine());
        System.out.println(m1.getFuelLevel());
    }
}
