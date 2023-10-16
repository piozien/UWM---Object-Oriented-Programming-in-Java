package F;

import java.util.Random;

public class F8 {
    public static void main(String[] args) {
        double[] tab = new double[10];
        Random random = new Random();

        for(int i = 0; i < tab.length; ++i) {
            tab[i] = random.nextDouble(6.0);
        }

        double[] var8 = tab;
        int var4 = tab.length;

        int i;
        for(i = 0; i < var4; ++i) {
            double liczba = var8[i];
            System.out.printf("%.2f ", liczba);
        }

        double suma = 0.0;

        for(i = 0; i < tab.length; ++i) {
            if (tab[i] > 0.5) {
                suma += tab[i];
            }
        }

        System.out.printf("%nSuma wynosi: %.2f", suma);
    }
}
