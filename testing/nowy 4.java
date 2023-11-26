Stwórz w klasie tylko jeden prywatny konstruktor z jednym argumentem. Z argumentu ustaw
wartość pola price. Zabronione jest tworzenie innych konstruktorów.
class Table {
    private double price;

    private Table(double price) {
        this.price = price;
    }

    public static Table create(double price) {
      return new Table(price);
    }
}
public class TestTable {
    public static void main(String[] args) {
        Table t1 = Table.create(123.45);
        System.out.println(t1);

    }
}
-------------------------------------------
W klasie Vehicle, zaimplementuj statyczną metodę createCar(String brand, String
model, int year). Metoda ma zwrócić nowy obiekt typu Vehicle, którego pola ustawione są z
argumentów metody.
W klasie Vehicle, zaimplementuj nie-statyczną metodę createVehicle(String brand,
String model, int year). Metoda ma zwrócić nowy obiekt typu Vehicle, którego pola ustawione są z
argumentów metody.

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

package moto;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = Vehicle.createCar("Mercedes","C", 2020 );
        Vehicle moto = new Vehicle();
        moto =  moto.createVehicle("Honda", "CBR", 2019);
    }
}

