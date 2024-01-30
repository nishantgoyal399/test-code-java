package com.kapil.learningjava.basics;

/**
 * Program to understand primitive data types in Java.
 *
 * @author Kapil Garg
 */
public class PrimitiveTypesDemo {

    public static void main(String[] args) {
        byteDemo();
        shortDemo();
        intDemo();
        longDemo();
        floatDemo();
        doubleDemo();
        charDemo();
        booleanDemo(true);
        booleanDemo(false);
    }

    // Method to understand byte primitive type
    private static void byteDemo() {
        byte byteValue = 10;
        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;
        System.out.println("Byte Value : " + byteValue);
        System.out.println("Maximum Byte Value : " + maxByteValue);
        System.out.println("Minimum Byte Value : " + minByteValue);
        System.out.println("Busted Maximum Byte Value : " + (maxByteValue + 1));        // Overflow
        System.out.printf("Busted Minimum Byte Value : %d\n", (minByteValue - 1));      // Underflow
    }

    // Method to understand short primitive type
    private static void shortDemo() {
        short shortValue = 100;
        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;
        System.out.println("\nShort Value : " + shortValue);
        System.out.println("Maximum Short Value : " + maxShortValue);
        System.out.println("Minimum Short Value : " + minShortValue);
        System.out.println("Busted Maximum Short Value : " + (maxShortValue + 1));       // Overflow
        System.out.printf("Busted Minimum Short Value : %d\n", (minShortValue - 1));     // Underflow
    }

    // Method to understand integer primitive type
    private static void intDemo() {
        int intValue = 1000;
        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;
        System.out.println("\nInteger Value : " + intValue);
        System.out.println("Maximum Integer Value : " + maxIntValue);
        System.out.println("Minimum Integer Value : " + minIntValue);
        System.out.println("Busted Maximum Integer Value : " + (maxIntValue + 1));      // Overflow
        System.out.printf("Busted Minimum Integer Value : %d\n", (minIntValue - 1));    // Underflow
    }

    // Method to understand long primitive type
    private static void longDemo() {
        long longValue = 10000L;
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        System.out.println("\nLong Value : " + longValue);
        System.out.println("Maximum Long Value : " + maxLongValue);
        System.out.println("Minimum Long Value : " + minLongValue);
        System.out.println("Busted Maximum Long Value : " + (maxLongValue + 1));        // Overflow
        System.out.printf("Busted Minimum Long Value : %d\n", (minLongValue - 1));      // Underflow
    }

    // Method to understand float primitive type
    private static void floatDemo() {
        float floatValue = 1.2f;
        // float floatValue = 1.2 --> Compile time Error; Casting required; Default type = double
        float myFloatValue = (float) 1.2;
        float maxFloatValue = Float.MAX_VALUE;
        float minFloatValue = Float.MIN_VALUE;
        System.out.println("\nFloat Value : " + floatValue);
        System.out.println("My Float Value : " + myFloatValue);
        System.out.println("Maximum Float Value : " + maxFloatValue);
        System.out.println("Minimum Float Value : " + minFloatValue);
    }

    // Method to understand double primitive type
    private static void doubleDemo() {
        double doubleValue = 1000d;
        double maxDoubleValue = Double.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;
        System.out.println("\nDouble Value : " + doubleValue);
        System.out.println("Maximum Double Value : " + maxDoubleValue);
        System.out.println("Minimum Double Value : " + minDoubleValue);
    }

    // Method to understand char primitive type
    private static void charDemo() {
        char charDemo = 'A';
        char unicodeChar = '\u0041';
        System.out.println("\n" + charDemo);
        System.out.println(unicodeChar);
        char copyrightChar = '\u00A9';
        System.out.println(copyrightChar);
    }

    // Method to understand boolean primitive type
    private static void booleanDemo(boolean onTime) {
        if (onTime) {
            System.out.println("\nOn Time");
        } else {
            System.out.println("\nLate");
        }
    }

}
