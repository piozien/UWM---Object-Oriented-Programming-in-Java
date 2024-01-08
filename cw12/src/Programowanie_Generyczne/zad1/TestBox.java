package Programowanie_Generyczne.zad1;

public class TestBox {
    public static void main(String[] args) {
        System.out.println("Dla int'a : ");
        Box<Integer> calkowita = new Box(7);
        System.out.println(calkowita.get());
        calkowita.set(5);
        System.out.println(calkowita.get());
        System.out.println("Dla stringa: ");
        Box<String> napis = new Box<>(null);
        System.out.println(napis.get());
        napis.set("napis");
        System.out.println(napis.get());
    }
}
