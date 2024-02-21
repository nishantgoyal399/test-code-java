package com.kapil.learnjava.operators;

/**
 * Program to understand the Bitwise AND, OR, XOR & Complement Operators in Java.
 *
 * @author Kapil Garg
 */
public class BitwiseOperatorsDemo {

    public static void main(String[] args) {
        int a = 24;                     // 1 1 0 0 0 (In Binary)
        int b = 19;                     // 1 0 0 1 1 (In Binary)
        bitwiseAndOperator(a, b);
        bitwiseOrOperator(a, b);
        bitwiseXorOperator(a, b);
        bitwiseComplementOperator(a);
        bitwiseComplementOperator(b);
    }

    private static void bitwiseAndOperator(int a, int b) {
        int result = a & b;             // Bitwise AND --> 1 0 0 0 0 --> 16 (In Decimal)
        System.out.println(a + " & " + b + " = " + result);
    }

    private static void bitwiseOrOperator(int a, int b) {
        int result = a | b;             // Bitwise OR  --> 1 1 0 1 1 --> 27 (In Decimal)
        System.out.println(a + " | " + b + " = " + result);
    }

    private static void bitwiseXorOperator(int a, int b) {
        int result = a ^ b;             // Bitwise XOR --> 0 1 0 1 1 --> 11 (In Decimal)
        System.out.println(a + " ^ " + b + " = " + result);
    }

    private static void bitwiseComplementOperator(int a) {
        int result = ~a;                // 1's complement --> Add 1 --> 2's complement
        System.out.println("~" + a + " = " + result);
    }

}


