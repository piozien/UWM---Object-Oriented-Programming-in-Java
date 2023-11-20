package pl.edu.uwm.motocykles;

public class TestMotorcykle {
    public static void main(String[] args) {
        Motorcykle m1 = new Motorcykle("", 2020, 2.5);
        Motorcykle m2 = new Motorcykle("Honda", 2023, 1.25);
        Motorcykle m3 = new Motorcykle(null,2022,2.2);
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
    }
}
