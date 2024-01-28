package com.kapil.learningjava.operators;

/**
 * Program to understand Pre Post Increment operator in Java.
 *
 * @author Kapil Garg
 */
public class PrePostIncrementDemo {

    public static void main(String[] args) {
        int i = 4;
        int j = i++;
        System.out.println("Value of i = " + i);    // Output 5
        System.out.println("Value of j = " + j);    // Output 4
        int k = ++i;
        System.out.println("Value of i = " + i);    // Output 6
        System.out.println("Value of k = " + k);    // Output 6
        j = i++;
        System.out.println("Value of i = " + i);    // Output 7
        System.out.println("Value of j = " + j);    // Output 6
        k = ++i;
        System.out.println("Value of i = " + i);    // Output 8
        System.out.println("Value of k = " + k);    // Output 8
    }

}
