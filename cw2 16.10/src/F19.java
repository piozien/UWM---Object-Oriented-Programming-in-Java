import java.util.Arrays;

public class F19 {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 6, 8, 2};
        System.out.println("Tablica 1: ");
        System.out.println(Arrays.toString(tab1));
        System.out.println("Tablica 2: ");
        System.out.println(Arrays.toString(copyArray(tab1)));
    }

    public static int[] copyArray(int[] tab) {
        int[] tab2 = new int[tab.length];

        for(int i = 0; i < tab.length; ++i) {
            tab2[i] = tab[i];
        }

        return tab2;
    }
}
