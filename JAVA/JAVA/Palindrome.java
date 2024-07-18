/*This is a program designed to check if a number is a palindrome or not.
 * The user can enter a number of their choice and then the program checks if the number entered is a palindrome or not.
 * It then displays the result depending on what the user has entered.
 */
package JAVA;

//Importing scanner class from java util package
import java.util.Scanner;

//Creating a class
public class Palindrome {

    public static void main(String[] args) {
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);

        // Requesting user to enter a number of their choice
        System.out.println("Please enter a number of your choice:");
        String inputValue = input.nextLine();

        // Check if the input is a palindrome
        if (isPalindrome(inputValue)) {
            System.out.println("The number entered is a Palindrome");// Displaying result if it is a palindrome
        } else {
            System.out.println("The number entered is not a palindrome"); // Displaying result if it is not a palindrome
        }
        // Closing the scanner to prevent leakage
        input.close();
    }

    // Method to check if it is a palindrome
    public static boolean isPalindrome(String inputValue) {
        int length = inputValue.length();
        for (int i = 0; i < length / 2; i++) {
            if (inputValue.charAt(i) != inputValue.charAt(length - i - 1)) {
                return false; // Return false if characters do not match
            }
        }
        return true; // Return true if it is a palindrome
    }
}