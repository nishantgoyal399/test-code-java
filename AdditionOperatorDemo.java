package com.kapil.learningjava.operators;

/**
 * Program to understand the Addition operator.
 *
 * @author Kapil Garg
 */
public class AdditionOperatorDemo {

    public static void main(String[] args) {
        add(5, 7);
        add(2, 9);
        add(8, 6);
    }

    // Method to perform addition of 2 numbers
    private static void add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, result);
    }

}
