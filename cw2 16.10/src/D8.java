public class D8 {
        public static void main(String[] args) {
            int[] liczby = {2, 5, 7};
            int l = liczby.length;
            for(int i = 0; i < l; ++i) {
                int n = liczby[i];
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

