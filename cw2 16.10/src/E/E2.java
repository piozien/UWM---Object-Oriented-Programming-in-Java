package E;
public class E2 {
        public static void main(String[] args) {
            int[] liczby = new int[]{2, 5, 7};
            int[] var2 = liczby;
            int var3 = liczby.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                int n = var2[var4];
                int wynik = sum(n);
                System.out.printf("Suma od %d do %d to: %d%n", n, 2 * n, wynik);
            }

        }

        public static int sum(int n) {
            int suma = 0;

            for(int i = n; i <= 2 * n; ++i) {
                suma += i;
            }

            return suma;
        }
    }

