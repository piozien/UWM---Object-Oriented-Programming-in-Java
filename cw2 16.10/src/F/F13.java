package F;

import java.util.Arrays;
import java.util.Random;

public class F13 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();

        for(int i = 0; i < tab.length; ++i) {
            tab[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(tab));
        System.out.printf("%nNajmiejsza wartość wynosi: %d", minimumValue(tab));
        int[] tab2 = new int[]{100};
        System.out.printf("%nNajmiejsza wartość wynosi: %d", minimumValue(tab2));
    }

    public static int minimumValue(int[] tab) {
        int min = tab[0];
        if (tab.length == 1) {
            return tab[0];
        } else {
            for(int i = 0; i < tab.length; ++i) {
                if (min > tab[i]) {
                    min = tab[i];
                }
            }

            return min;
        }
    }
}
