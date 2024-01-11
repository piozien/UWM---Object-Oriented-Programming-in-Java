package optimize;

public class Find {
    public <T extends Comparable<T>> T findMax(T first, T second, T third) {
        T max = first;

        if (second.compareTo(max) > 0) {
            max = second;
        }

        if (third.compareTo(max) > 0) {
            max = third;
        }

        return max;
    }
}
