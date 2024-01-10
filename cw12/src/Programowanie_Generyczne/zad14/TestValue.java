package Programowanie_Generyczne.zad14;

public class TestValue extends Value {
    public static void main(String[] args) {
        Integer[] intArray = {10, 5, 6, 2, 20, 8, 1};
        Double[] doubleArray = {1.123, 2.12, 3.14, 5.20, 0.23, 5.21};
        String[] stringArray = {"POC", "Hello", "World", "string"};
        Person[] personArray = {
                new Person("Piotr", 20),
                new Person("XYZ", 30),
                new Person("Person", 22),
                new Person("Jan", 20)
        };
        System.out.println("Min value in intArray: " + minValue(intArray));
        System.out.println("Min value in doubleArray: " + minValue(doubleArray));
        System.out.println("Min value in stringArray: " + minValue(stringArray));
        System.out.println("Min value in personArray: " + minValue(personArray));
    }
}
