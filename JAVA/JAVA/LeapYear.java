/*This program is designed to check if the year entered by the user is a leap year or not.
 * It then displays the result depending on what the user entered.
 */
package JAVA;

//Importing scanner class from java util package
import java.util.Scanner;

//Creating a class
public class LeapYear {

    public static void main(String[] args) {
        // Creating object of scanner class
        Scanner leapYear = new Scanner(System.in);

        // Requesting the user to enter the year of choice
        System.out.println("Please can you enter the year of your choice:");
        // Getting the year
        int year = leapYear.nextInt();

        // Closing scanner to prevent leakage
        leapYear.close();

        boolean isleapYear = checkLeapYear(year);
        if (isleapYear) {
            System.out.println("The year you entered" + " " + year + " " + "is a leap year");
        } else {
            System.out.println("The year you entered" + " " + year + " " + "is not a leap year");
        }
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));

    }

}
