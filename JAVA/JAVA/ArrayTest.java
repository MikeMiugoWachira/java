/*This is a java program designed to receive 15 values of type integer from the user and then store the values in an array.
 * The values are then displayed on the screan and then the user is requested to a value which the program checks to see if it is available in the array.
 * Another array is created and the elements are copied in reverse order.
 * The program then calculates the sum and the product of all the elements in the array and displays it.
 */
package JAVA;

//Importing sacnner class from java util package
import java.util.Scanner;

//Creating a class
public class ArrayTest {

    public static void main(String[] args) {
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        // Here an array is created to store the marks
        int[] array = new int[15];

        // The user is requested to enter 15 values of type integer
        System.out.println("Please enter 15 intergers of your choice:");
        for (int x = 0; x < array.length; x++) {
            // Getting the 15 values
            array[x] = input.nextInt();
        }

        // This will print the values stored in the array on the screen
        System.out.println("Elements stored in the array are:");
        for (int elements : array) {
            System.out.print(elements + "  ");
        }
        System.out.println();

        // This check if the number entered by the user is present in the array or not
        System.out.print("Enter a number to check if it is present in the array: ");
        int checkArray = input.nextInt();
        // Closing the scanner to prevent leakage
        input.close();
        boolean present = false;
        for (int x = 0; x < array.length; x++) {
            if (array[x] == checkArray) {
                System.out.println("The number found at index " + x);
                present = true;
                break;
            }
        }
        if (!present) {
            // If the number entred by the user is not in the array it will display this
            // message
            System.out.println("Number not found in this array");
        }

        // Create another array, copy elements in reverse order, and print it
        int[] reversedOrder = new int[15];
        for (int i = 0; i < array.length; i++) {
            reversedOrder[i] = array[array.length - 1 - i];
        }

        System.out.println("Elements of the new reversed array are:");
        for (int elements : reversedOrder) {
            System.out.print(elements + " ");
        }

        System.out.println();// Adding a new line

        // Get the sum and product of all elements in the array
        int sum = 0;
        long product = 1;
        for (int elements : array) {
            sum += elements;
            product *= elements;
        }

        // The sum of all elements is displayed to the user
        System.out.println("The sum of all elements in the array is: " + sum);

        // The product of all elements is diplayed to the user
        System.out.println("The product of all elements in the array is: " + product);
    }
}
