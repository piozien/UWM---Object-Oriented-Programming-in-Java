import java.util.Arrays;
import java.util.Random;

public class F27 {
    public static void main(String[] args){
        int[] tab = new int[15];
        Random random = new Random();

        for(int i = 0; i < tab.length; ++i) {
            tab[i] = random.nextInt(50);
        }
        printArray(tab);
    }
    public static void printArray(int[] tab) {
        System.out.println(Arrays.toString(tab));
    }
}
