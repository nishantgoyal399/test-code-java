package com.kapil.learnjava.operators;

/**
 * Program to understand Pre-Post Decrement Operator in Java.
 *
 * @author Kapil Garg
 */
public class PrePostDecrementDemo {

    public static void main(String[] args) {
        int i = 4;
        int j = i--;
        System.out.println("Value of i :: " + i);    // Output 3
        System.out.println("Value of j :: " + j);    // Output 4
        int k = --i;
        System.out.println("Value of i :: " + i);    // Output 2
        System.out.println("Value of k :: " + k);    // Output 2
        j = i--;
        System.out.println("Value of i :: " + i);    // Output 1
        System.out.println("Value of j :: " + j);    // Output 2
        k = --i;
        System.out.println("Value of i :: " + i);    // Output 0
        System.out.println("Value of k :: " + k);    // Output 0
    }

}
