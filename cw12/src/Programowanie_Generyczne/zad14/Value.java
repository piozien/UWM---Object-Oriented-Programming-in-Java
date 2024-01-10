package Programowanie_Generyczne.zad14;

public class Value {
    public static <T extends Comparable<T>> T minValue(T[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must have at least one element");
        }

        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }
}
