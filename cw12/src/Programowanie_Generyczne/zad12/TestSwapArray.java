package Programowanie_Generyczne.zad12;

import java.util.Arrays;

public class TestSwapArray extends SwapArray {
    public static void main(String[] args) {
        Integer[] intArray = {1, 10, 5, 16, 8, 20};
        System.out.println("Before swap: " + Arrays.toString(intArray));
        swap(intArray, 0, 2);
        System.out.println("After swap: " + Arrays.toString(intArray));

        String[] stringArray = {"napis", "!", "zaprogramować", "można"};
        System.out.println("Before swap: " + Arrays.toString(stringArray));
        swap(stringArray, 1, 3);
        System.out.println("After swap: " + Arrays.toString(stringArray));
        Integer[] arr = {};
        try {
            swap(arr, 0, 0);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            swap(intArray, 0, 10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
