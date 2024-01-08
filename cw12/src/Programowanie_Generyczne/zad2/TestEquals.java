package Programowanie_Generyczne.zad2;

public class TestEquals extends EqualsCheck {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 10;
        double d = 10.5;
        String napis = "Hello";
        String napis2 = "Hello";
        System.out.printf("%d is eqals %d: %b", a,b, isEqual(a,b));
        System.out.printf("\n%d is eqals %d: %b", a,c, isEqual(a,c));
        System.out.printf("\n%d is eqals %.2f: %b", a,d, isEqual(a,d));
        System.out.printf("\n%b is eqals %b: %b", napis,napis2 , isEqual(napis,napis2));
    }
}
