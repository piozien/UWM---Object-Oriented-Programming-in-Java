package Programowanie_Generyczne.zad22;



public class TestCar {
    public static void main(String[] args) {

        Car c1 = new Car("model1", "xyz");
        Car c2 = new Car("model2", "zyx");
        ElectricCar e1 = new ElectricCar("model1", "xyz-e");


        System.out.println("Cars are of the same type: " + CarCompare.compareObjects(c1, c2));
        System.out.println("Cars are of the same type: " + CarCompare.compareObjects(c1, e1));
    }
}
