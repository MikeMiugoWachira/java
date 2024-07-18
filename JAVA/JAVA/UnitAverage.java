/*This is a program designed to receive input from the lecturer and calculate the average.
 * The lecturer will be requested to enter marks of three units and then the average is calculated
 * Then the marks of the three units and the average will be displayed.
 */
package JAVA;

//Importing scanner class from java util package
import java.util.Scanner;

//Creating a class
public class UnitAverage {
    public static void main(String[] args) {
        // Creating object of scanner class
        Scanner marks = new Scanner(System.in);

        // Requesting the lecturer to enter the marks of Java programming
        System.out.println("Please enter the marks of Java programming:");
        // Getting the marks
        double java = marks.nextDouble();

        // Requesting the lecturer to enter the marks of Networking
        System.out.println("Please enter the marks of Networking:");
        // Getting the marks
        double networking = marks.nextDouble();

        // Requesting the lecturer to enter the marks of Maths
        System.out.println("Please enter the marks of Maths:");
        // Getting the marks
        double maths = marks.nextDouble();

        // Closing the scanner class to prevent leakage
        marks.close();

        // Calculating the average marks
        double average = (java + networking + maths) / 3;
        // Displaying the marks of java programming
        System.out.println("The marks for Java programming is:" + " " + java);

        // Displaying the marks of Networking
        System.out.println("The marks for Networking is:" + " " + networking);

        // Displaying the marks of Maths
        System.out.println("The marks for Maths is:" + " " + maths);

        // Displaying the total average marks
        System.out.println("The average marks is:" + " " + average);

    }

}
