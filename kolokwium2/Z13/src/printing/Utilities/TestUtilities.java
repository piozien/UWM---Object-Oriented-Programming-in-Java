package printing.Utilities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestUtilities {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        list1.add("string1");
        list1.add("string2");
        list1.add("string3");
        list1.add("string4");
        list1.add("string5");
        list1.add("string6");
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        Print p1 = new Print();
        System.out.println("For ArrayList: ");
        p1.printEverySecond(list1);
        System.out.println("For HashSet: ");
        p1.printEverySecond(set1);
    }
}
