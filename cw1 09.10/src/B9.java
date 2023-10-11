import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datę w formacie DD.MM.RRRR: ");
        String data = scanner.nextLine();

        if (sprawdzDate(data)) {
            System.out.println("Podana data jest poprawna.");
        } else {
            System.out.println("Podana data jest niepoprawna.");
        }
    }
    public static boolean sprawdzDate(String data) {
        String[] elementyDaty = data.split("\\.");

        if (elementyDaty.length != 3) {
            return false;
        }

        int dzien = Integer.parseInt(elementyDaty[0]);
        int miesiac = Integer.parseInt(elementyDaty[1]);
        int rok = Integer.parseInt(elementyDaty[2]);

        if (miesiac < 1 || miesiac > 12) {
            return false;
        }
        int[] dniWMiesiacach = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (czyRokPrzestepny(rok)) {
            dniWMiesiacach[2] = 29;
        }

        if (dzien < 1 || dzien > dniWMiesiacach[miesiac]) {
            return false;
        }

        return true;
    }
    public static boolean czyRokPrzestepny(int rok) {
        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
