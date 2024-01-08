package Wyjątki.zad1;

public class zad1 {
    public static void checkAge(int age){
        if(age <= 18){
            throw new IllegalArgumentException("Wiek nie może być mniejszy niż 18!");
        }
        System.out.printf("Wiek (%d) jest prawidłowy!\n", age);
    }

    public zad1() {

    }
}
