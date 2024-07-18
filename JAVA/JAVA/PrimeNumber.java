/*This program is designed to display prime numbers between 1 and 150.*/
package JAVA;

//Importing math class from java lang package
import java.lang.Math;

public class PrimeNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int value) {

        // Handle edge cases
        if (value <= 1) {
            return false;
        }
        // Check for factors from 2 to the square root of the number
        for (int x = 2; x <= Math.sqrt(value); x++) {
            if (value % x == 0) {
                return false;
            }
        }
        return true;
    }

    // Main method to display prime numbers between 1 and 500
    public static void main(String[] args) {

        System.out.println("Prime numbers between 1 and 500 are:");
        for (int x = 1; x <= 500; x++) {
            if (isPrime(x)) {
                // The prime numbers from 1 to 500 are displayed
                System.out.print(x + " ");
            }
        }
    }
}
