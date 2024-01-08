package Wyjątki.zad1;

public class TestZad1 {
    public static void main(String[] args) {
        try{
            zad1 first = new zad1();
            zad1 sec = new zad1();
            zad1.checkAge(30);
            zad1.checkAge(15);
        }
        catch(IllegalArgumentException e){
            System.out.println("Wystąpił błąd: " + e.getMessage());

        }
    }
}
