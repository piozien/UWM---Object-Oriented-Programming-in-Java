import java.util.Scanner;

public class C15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz liczbę: ");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Wprowadzono nieprawidłową liczbę!");
        }
        else {
            int wynika = przyklada(n);
            System.out.println("Przykład a) Wartość " + n + "-tego elementu ciągu wynosi: " + wynika);
            int wynikb = przykladb(n);
            System.out.println("Przykład b) Wartość " + n + "-tego elementu ciągu wynosi: " + wynikb);
            int wynikc = przykladc(n);
            System.out.println("Przykład c) Wartość " + n + "-tego elementu ciągu wynosi: " + wynikc);
        }
    }
    public static int przyklada(int n) {
        int a = 4;
        for (int i = 1; i < n; i++) {
            if (n % 2 == 0) {
                a = -a * 2;
            } else {
                a = a * 2;
            }
        }
        return a;
    }
    public static int przykladb(int n) {
        int b = 2;
        for (int i = 1; i < n; i++) {
            b = b *3;
        }
        return b;
    }
    public static int przykladc(int n) {
        int c = 8;
        int roz = -5;
        for (int i = 1; i < n; i++) {
            c += roz;
        }
        return c;
    }
}

