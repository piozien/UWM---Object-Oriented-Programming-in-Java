package G;

import java.util.ArrayList;

public class G8 {
    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>() {{
            add(0);
            add(1);
            add(2);
            add(0);
            add(3);
            add(0);
            add(4);
        }};
            System.out.printf("Lista: %s%n", lt);
            System.out.printf("Liczba 0 w liście wynosi: %d", countZeros(lt));

    }

    public static int countZeros(ArrayList<Integer> lista) {
        int count = 0;
        for (int elm : lista) {
            if (elm == 0) {
                count++;
            }
        }
        return count;
    }
}
