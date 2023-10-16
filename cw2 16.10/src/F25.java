import java.util.Arrays;

public class F25 {
    public static void main(String[] args){
        int[] tab1 = {1, 2, 3, 4, 5};
        int[] tab2 = {1, 2, 3, 4, 5};
        int[] tab3 = {1, 2, 3, 4, 6};
        System.out.printf("Sprawdzenie dla tab1 i tab2: %s%n", checkEquality(tab1,tab2));
        System.out.printf("Sprawdzenie dla tab1 i tab3: %s", checkEquality(tab1,tab3));
    }
    public static boolean checkEquality(int[] tab1, int[] tab2) {
        return Arrays.equals(tab1, tab2);
    }
}
