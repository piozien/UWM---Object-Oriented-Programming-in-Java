package zadC1;

import java.util.ArrayList;
import java.util.List;

public class TestC1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(21);
        list1.add(13);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(50);

        List<Integer> mergedList = C1.mergeLists(list1, list2);

        System.out.println("Połączone listy:");
        for (Integer item : mergedList) {
            System.out.println(item);
        }
    }
}
