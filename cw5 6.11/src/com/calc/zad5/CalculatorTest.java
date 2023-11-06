package com.calc.zad5;

import java.sql.SQLOutput;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int additionResult = Calculator.add(num1, num2);
        int subtractionResult = Calculator.subtract(num1, num2);
        int multiplicationResult = Calculator.multiply(num1, num2);
        double divisionResult = Calculator.divide(num1, num2);
        System.out.println("The result of the addition: " + additionResult);
        System.out.println("The result of subtraction: " + subtractionResult);
        System.out.println("The result of multiplication: " + multiplicationResult);
        System.out.println("The result of dividing: " + divisionResult);
    }
}
