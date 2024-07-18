/*This program is designed to check the largest number snd the smallest number.
 * The user is requested to enter 3 numbers of their choice and then the program checks for the largest and the smallest number.
 * The result is then diplayed depending on the user's input
 */
package JAVA;

//Importing scanner class from java util package
import java.util.Scanner;

//Creating a class
public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Requesting the user to enter the first number
        System.out.println("Please enter the first number:");
        // Getting the first number
        int firstNumber = input.nextInt();

        // Requesting the user to enter the second number
        System.out.println("Please enter the second number:");
        // Getting the second number
        int secondNumber = input.nextInt();

        // Requesting the user to enter the third number
        System.out.println("Please enter the third number:");
        // Getting the the third number
        int thirdNumber = input.nextInt();

        // Closing scanner to prevent leakage
        input.close();

        int largest, smallest;

        // The if else statement has been used to check the largest number
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            largest = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            largest = secondNumber;
        } else {
            largest = thirdNumber;
        }

        // The if else statement has been used to check the smallest number
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            smallest = firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            smallest = secondNumber;
        } else {
            smallest = thirdNumber;
        }

        // Displaying the largest number
        System.out.println("The largest number:" + largest);

        // Displaying the smallest number
        System.out.println("The smallest number:" + smallest);

        // Displaying both the largest and the smallest number
        System.out.println(largest + " " + "is your largest and" + " " + smallest + " " + "is your smallest number");
    }
}