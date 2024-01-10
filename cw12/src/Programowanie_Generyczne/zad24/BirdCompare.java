package Programowanie_Generyczne.zad24;

import java.util.Comparator;

public class BirdCompare {
    public static <T extends Bird> T findMin(Triple<? extends T> t) {
        T first = t.getFirst();
        T second = t.getSecond();
        T third = t.getThird();

        T min = first;


        if (second.getName().compareTo(first.getName()) < 0) {
            min = second;
        }


        if (third.getName().compareTo(min.getName()) < 0) {
            min = third;
        }

        return min;
    }


}
