import java.util.Arrays;
import java.util.Random;

public class F3 {
    public static void main(String[] args) {
        int[] tab = new int[15];
        Random random = new Random();


        for(int i = 0; i < tab.length; ++i) {
            tab[i] = random.nextInt(50);
        }

        System.out.printf(Arrays.toString(tab));
        int najw = tab[0];
        int najm = tab[0];

        for(int i = 1; i < tab.length; ++i) {
            if (najw < tab[i]) {
                najw = tab[i];
            }

            if (najm > tab[i]) {
                najm = tab[i];
            }
        }

        System.out.printf("%nNajwiększa wartość w tablicy wynosi: %d%n", najw);
        System.out.printf("Najmniejsza wartosć w tablicy wynosi: %d%n", najm);
    }
}
