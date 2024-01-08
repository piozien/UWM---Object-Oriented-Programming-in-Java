package Wyjątki.zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        try{
            System.out.println("Podaj pierwszą liczbę: ");
            int a = s1.nextInt();
            System.out.println("Podaj drugą liczbę: ");
            int b = s1.nextInt();
            int result = divide(a,b);
            System.out.println("Result: " + result);
        }
        catch(InputMismatchException e){
            System.out.println("Błąd: Wprowadź ponownie liczbę całkowitą!");
        }
        catch (ArithmeticException e){
            System.out.println("Błąd " + e.getMessage());
        }
        finally {
            s1.close();

        }

    }

}
