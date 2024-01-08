package Programowanie_Generyczne.zad4;

public class TestTriple {
    public static void main(String[] args) {
        Triple<Integer, Double, String> test = new Triple<>(5,10.5,"test-string");
        System.out.println(test.getFirst());
        System.out.println(test.getSecond());
        System.out.println(test.getThird());
    }
}
