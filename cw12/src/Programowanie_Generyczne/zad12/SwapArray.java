package Programowanie_Generyczne.zad12;

public class SwapArray {
    public static<T> void swap(T[] array, int i, int j){
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IllegalArgumentException("Index out of the range!");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j]= temp;
    }
}
