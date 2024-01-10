package university;

import java.util.Arrays;

public class FindMedian {
    public static <T extends Comparable<T>> T findMedian(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        Arrays.sort(array);

        int middleIndex = array.length / 2;
        return array[middleIndex];
    }
}
