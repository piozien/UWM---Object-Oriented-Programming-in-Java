package Programowanie_Generyczne.zad15;

public class Value {
    public static <T extends Comparable<T>> T maxValue(T[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must have at least one element");
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}
