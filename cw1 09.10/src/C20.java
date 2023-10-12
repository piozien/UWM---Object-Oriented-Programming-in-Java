import java.util.Scanner;

public class C20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] zm = new int[2];
        String[] zmn = {"n", "m"};

        for (int i = 0; i < 2; i++) {
            System.out.println("Wprowadz zmienna " + zmn[i] + ": ");
            zm[i] = input.nextInt();
        }
        int n = zm[0];
        int m = zm[1];
        int wynik = 1;
        if (n < m) {
            for (int i = n; i <= m; i++) {
                wynik *= i;
            }
            System.out.println("Wartość mnożenia od " + n + " do " + m + " wynosi: " +  wynik);
        }
        else{
            System.out.println("Zmienne nie spełniają warunków zadania!");
        }


    }
}
