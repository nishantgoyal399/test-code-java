package com.kapil.learnjava.operators;

/**
 * Program to understand Shorthand Assignment Operators in Java.
 *
 * @author Kapil Garg
 */
public class ShortHandOperatorsDemo {

    public static void main(String[] args) {
        int i = 5, j = 7, k = 9;
        i += 3;                                 // i = i + 3
        j -= 4;                                 // j = j - 4
        k *= 2;                                 // k = k * 2
        System.out.println("i :: " + i);
        System.out.println("j :: " + j);
        System.out.println("k :: " + k);
        byte a = 7, b = 7;
        a = (byte) (a * 2.6);                   // b = b * 2.6 --> compile-time error
        System.out.println("a :: " + a);
        b *= 2.6;
        System.out.println("b :: " + b);
        int x = 10;
        x = (int) (x - 5.5);                    // x -= 5.5 --> compile-time error
        System.out.println("x :: " + x);        // Output 4 (Actual result should've been 4.5)
    }

}
