import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        System.out.println("Kalkulator");
        System.out.println("Podaj pierwszą liczbę: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = input.nextInt();
        System.out.println("Dodawanie: " + (a + b));
        System.out.println("Odejmowanie: " + (a - b));
        System.out.println("Mnożenie: " + (a * b));
        if (b == 0) {
            System.out.println("Dzielenie:\nNie można dzielić przez 0!!");
        } else {
            System.out.println(("Dzielenie: " + (a / b)));
        }
    }
}
