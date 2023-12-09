package rekord.zad6;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("Brand1", "Model1", 4.5);
        System.out.println(c1.fuelCost(5.5, 100));
        Car c2 = new Car("Brand2", "Model2", 16.5);
        System.out.println(c2.fuelCost(6.0, 210));
    }
}
