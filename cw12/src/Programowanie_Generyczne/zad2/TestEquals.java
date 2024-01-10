package Programowanie_Generyczne.zad2;

public class TestEquals extends EqualsCheck {
    public static void main(String[] args) {
        EqualsCheck a = new EqualsCheck();

        System.out.println(a.isEqual(10,5));
        System.out.println(a.isEqual(10,10));
        System.out.println(a.isEqual(10,10.5));
        System.out.println(a.isEqual("hello","Hello"));
    }
}
