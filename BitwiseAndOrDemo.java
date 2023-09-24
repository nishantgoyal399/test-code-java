package com.kapil.java.operators;

/**
 * Program to understand Bitwise AND/OR operators.
 *
 * @author Kapil Garg
 */
public class BitwiseAndOrDemo {

    public static void main(String[] args) {
        int a = 25;                     // 1 1 0 0 1
        int b = 15;                     // 0 1 1 1 1
        bitwiseAndOperator(a, b);
        bitwiseOrOperator(a, b);
    }

    private static void bitwiseAndOperator(int a, int b) {
        int result = a & b;             // Bitwise AND 0 1 0 0 1 --> 9
        System.out.println("Result of Bitwise AND operation on " + a + " & " + b + " is " + result);
    }

    private static void bitwiseOrOperator(int a, int b) {
        int result = a | b;             // Bitwise OR  1 1 1 1 1 --> 31
        System.out.println("\nResult of Bitwise OR operation on " + a + " & " + b + " is " + result);
    }

}
