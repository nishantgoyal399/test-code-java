package com.kapil.learningjava.operators;

/**
 * Program to understand Short Hand operators.
 *
 * @author Kapil Garg
 */
public class ShortHandOperatorsDemo {

    public static void main(String[] args) {
        int i = 5, j = 7, k = 9;
        i += 3;                         // i = i + 3
        j -= 4;                         // j = j - 4
        k *= 2;                         // k = k * 2
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        byte b1 = 7, b2 = 7;
        b1 = (byte) (b1 * 2.6);         // b = b * 2.6 --> Compile time error;
        System.out.println(b1);
        b2 *= 2.6;
        System.out.println(b2);
    }

}
