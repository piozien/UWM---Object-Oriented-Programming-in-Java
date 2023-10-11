import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj godzinę: ");
        int godzina = scanner.nextInt();
        System.out.print("Podaj minuty: ");
        int minuty = scanner.nextInt();
        System.out.print("Podaj sekundy: ");
        int sekundy = scanner.nextInt();

        if (czyPoprawnaGodzina(godzina, minuty, sekundy)) {
            System.out.println("Poprawna godzina!");
        } else {
            System.out.println("Niepoprawna godzina.");
        }
    }
    public static boolean czyPoprawnaGodzina(int godzina, int minuty, int sekundy) {
        return (godzina >= 0 && godzina <= 23) &&
                (minuty >= 0 && minuty <= 59) &&
                (sekundy >= 0 && sekundy <= 59);
    }
}






