package Wyjątki.zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zad2 {

    public static int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Dzielenie przez 0 nie jest możliwe!");
        }
        return a/b;
    }
}
