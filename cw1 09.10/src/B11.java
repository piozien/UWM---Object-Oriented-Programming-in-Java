import java.util.Scanner;

public class B11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj trzycyfrową liczbę całkowitą: ");
        int liczba = input.nextInt();
        if(liczba>= 100 && liczba<=999) {
            if (Palindrom(liczba)) {
                System.out.println("Podana liczba jest palindromem.");
            } else {
                System.out.println("Podana liczba nie jest palindromem.");
            }
        }
        else{
            System.out.println("Wprowadzona liczba nie spełnia warunków zadania!");
        }

    }

    public static boolean Palindrom(int liczba) {

        int originalNumber = liczba;
        int reversedNumber = 0;

        while (liczba != 0) {
            int digit = liczba % 10;
            reversedNumber = reversedNumber * 10 + digit;
            liczba /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
