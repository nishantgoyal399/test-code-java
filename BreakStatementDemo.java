package com.kapil.java.basics;

/**
 * Program to understand the Labelled and Unlabelled Break statement.
 *
 * @author Kapil Garg
 */
public class BreakStatementDemo {

    public static void main(String[] args) {
        unlabelledBreak();
        labelledBreak();
    }

    // Method for unlabelled break demo
    private static void unlabelledBreak() {
        for (int i = 1; i < 5; i++) {
            System.out.println("\nOuter loop started");
            System.out.println("Outer loop iteration: #" + i);
            for (int j = 1; j < 5; j++) {
                if (i == 3) {
                    System.out.println("Unlabelled break Triggered");
                    break;                                                  // unlabelled break statement
                }
                System.out.println("Inner loop iteration: #" + j);
            }
            System.out.println("Outer loop ended");
        }
    }

    // Method for labelled break demo
    private static void labelledBreak() {
        LBS:
        for (int i = 1; i < 5; i++) {
            System.out.println("\nOuter loop started");
            System.out.println("Outer loop iteration: #" + i);
            for (int j = 1; j < 5; j++) {
                if (i == 3) {
                    System.out.println("Labelled break Triggered");
                    break LBS;                                              // labelled break statement
                }
                System.out.println("Inner loop iteration: #" + j);
            }
            System.out.println("Outer loop ended");
        }
    }

}
