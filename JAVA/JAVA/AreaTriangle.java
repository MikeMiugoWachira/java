/*This is a program designed to calculate the area of a rectangle.
 * It request the user to enter the base and height of the rectangle then it calculates the area.
 * The result is then displayed.
 */
package JAVA;

//Importing scanner class from java util package
import java.util.Scanner;

//Creating a class
public class AreaTriangle {

    // Method to request user to enter the base and height of the triangle

    public double[] userInput() {
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);

        // Requesting the user to enter the value of height
        System.out.println("Please enter the height of the triangle");
        // getting the value of height
        double height = input.nextDouble();

        // Requesting the user to enter the value of base
        System.out.println("Please enter the base of the triangle");
        // getting the value of base
        double base = input.nextDouble();

        // Closing the scanner to prevent leakage
        input.close();
        return new double[] { base, height };
    }

    // Method to compute area of the
    public double areaCalculation(double base, double height) {
        return 1 / 2 * height * base;
    }

    // Method to output the calculated area of the triangle and display it to the
    // user

    public void areaDisplay(double area) {
        System.out.println("The area of the triangle is:" + " " + area);
    }

    // The main method
    public static void main(String[] args) {
        AreaTriangle areaTriangle = new AreaTriangle();

        // Input from the user
        double[] dimensions = areaTriangle.userInput();
        double base = dimensions[0];
        double height = dimensions[1];

        // Calculation of the area
        double area = areaTriangle.areaCalculation(base, height);

        // Displaying the result
        areaTriangle.areaDisplay(area);

    }

}
