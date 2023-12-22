package Wyjątki.zad1;

public class zad1 {
    public static void checkAge(int age){
        if(age <= 18){
            throw new IllegalArgumentException("Wiek nie może być mniejszy niż 18!");
        }
        System.out.printf("Wiek (%d) jest prawidłowy!\n", age);
    }

    public static void main(String[] args) {
        try{
            checkAge(30);
            checkAge(15);
        }
        catch(IllegalArgumentException e){
            System.out.println("Wystąpił błąd: " + e.getMessage());

        }
    }
}
