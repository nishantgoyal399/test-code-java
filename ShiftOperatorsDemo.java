package com.kapil.java.operators;

/**
 * Program to understand Shift operators.
 *
 * @author Kapil Garg
 */
public class ShiftOperatorsDemo {

    public static void main(String[] args) {
        int a = 8;                              // 1 0 0 0
        int b = a << 2;                         // Left Shift --> 1 0 0 0 0 0 --> 32
        System.out.println(b);
        int c = a >> 2;                         // Right Shift --> 10 --> 2
        System.out.println(c);
    }

}
