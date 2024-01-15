package utilities;

import java.util.ArrayList;
import java.util.Collection;

public class TestUtil {
        public static void main(String[] args) {
            ArrayList<Integer> intarr = new ArrayList<>();
            intarr.add(1);
            intarr.add(2);
            intarr.add(3);

            ArrayList<Number> num = new ArrayList<>();
            num.add(0.0);
            num.add(0.5);
            num.add(1.0);

           appendFromEnd(num, intarr);

            System.out.println(num);
        }

    public static <E> void appendFromEnd(ArrayList<? super E> arr1, ArrayList<E> arr2) {
        for (Object element : arr1) {
            arr2.add((E) element);
        }
    }
}
