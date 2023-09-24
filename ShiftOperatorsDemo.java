package com.kapil.java.operators;

/**
 * Program to understand Shift operators.
 *
 * @author Kapil Garg
 */
public class ShiftOperatorsDemo {

    public static void main(String[] args) {
        int a = 8;                              // 1 0 0 0 (In Binary)
        System.out.println("a = " + a);
        int b = a << 2;                         // Left Shift  --> 1 0 0 0 0 0 --> 32 (In Decimal)
        System.out.println("b = " + b);
        int c = a >> 2;                         // Right Shift --> 1 0 --> 2 (In Decimal)
        System.out.println("c = " + c);
    }

}
