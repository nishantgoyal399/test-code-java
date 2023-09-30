package com.kapil.java.basics;

/**
 * Program to understand format specifiers used with printf method.
 * Note: Same format specifiers are used for printf and format methods.
 *
 * @author Kapil Garg
 */
public class FormatSpecifiersDemo {

    public static void main(String[] args) {
        System.out.println("========== Int Demo =========");
        intDemo();
        System.out.println("\n========== Float Demo =======");
        floatingPointDemo();
        System.out.println("\n========== Char Demo ========");
        charDemo();
        System.out.println("\n========== String Demo ======");
        stringDemo();
        System.out.println("\n========== Boolean Demo =====");
        booleanDemo();
    }

    private static void intDemo() {
        int number = 14;
        System.out.printf("%n%d%n", number);              			// Int number
        System.out.printf("%03d%n", number);            			// Prints 3 digit int number
        System.out.printf("%o%n", number);              			// Octal value of number
        System.out.printf("%x%n", number);              			// Hexadecimal value of number
        System.out.printf("%X%n", number);              			// Hexadecimal value of number (UPPERCASE)
        System.out.printf("%10d Hey%n", number);        			// Adds 10 spaces before the number
        System.out.printf("%-10d Hello%n", number);     			// Adds 10 spaces after the number
    }

    private static void floatingPointDemo() {
        double number = 17.267396;
        System.out.printf("%n%f%n", number);            			// Float/Double number
        System.out.printf("%.2f%n", number);            			// Number up to 2 decimal places
        System.out.printf("%.4f%n", number);            			// Number up to 4 decimal places
        System.out.printf("%e%n", number);              			// Exponential form
        System.out.printf("%E%n", number);              			// Exponential form
    }

    private static void charDemo() {
        char myChar = 'a';
        System.out.printf("%n%c%n", myChar);            			// Prints a
        System.out.printf("%C%n", myChar);              			// Prints A
    }

    private static void stringDemo() {
        String myString = "Kapil";
        System.out.printf("%n%s%n", myString);          			// Prints Kapil
        System.out.printf("%S%n", myString);            			// Prints KAPIL
        System.out.printf("%.2s%n", myString);          			// Prints Ka
        System.out.printf("'%-10s'%n", myString);       			// Adds 10 spaces after Kapil
        System.out.printf("'%10s'%n", myString);        			// Adds 10 spaces before Kapil
        // Re-ordering the output using format specifier
        System.out.printf("%n%s, %s, %s%n", "I", "U", "C");		    // Prints I, U, C
        System.out.printf("%3$s, %1$s, %2$s%n", "I", "U", "C");	    // Prints C, I, U
    }
	
	private static void booleanDemo() {
        System.out.printf("%n%b%n", true);            				// Prints true
        System.out.printf("%B%n", true);            				// Prints TRUE
        System.out.printf("%b%n", "random text");   				// Prints true
        System.out.printf("%b%n", false);           				// Prints false
        System.out.printf("%b%n", (Object) null);   				// Prints false
    }

}
