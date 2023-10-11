import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] zm = new int[3];
        String[] zmn = {"1", "2", "3"};

        for (int i = 0; i < 3; i++) {
            System.out.println("Wprowadz zmienna nr " + zmn[i] + ": ");
            zm[i] = input.nextInt();
        }
        int a = zm[0];
        int b = zm[1];
        int c = zm[2];
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Posortowane zmienne w kolejności rosnącej: " + a + ", " + b + ", " + c);
    }

}
