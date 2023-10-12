import java.util.Scanner;

public class C5 {
    public static void main(String[] args) {
        int count = 0;
        int number = 0;

        System.out.println("Pierwsze 20 liczb parzystych: ");

        do {
            number += 2;
            System.out.print(number + " ");
            count++;
        } while (count < 20);

        count = 0;
        number = 1;
        System.out.println("\nPierwsze 20 liczb nieparzystych: ");
        do {
            System.out.print(number + " ");
            number += 2;
            count++;
        } while (count < 20);
    }
}


