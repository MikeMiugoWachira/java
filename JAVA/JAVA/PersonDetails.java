/*This is a program designed to display a person's details like name, registration number, age and address of the person.
 * It also checks if the person is an adult.
 */
package JAVA;

//Creating a class
public class PersonDetails {
    private String name, address;
    private int age, regNo;

    // Constructor
    public PersonDetails(String name, int age, String address, int regNo) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.regNo = regNo;
    }

    // Non-static method to display the person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("regNo: " + regNo);
    }

    // Static method to create a new Person object
    public static PersonDetails createPerson(String name, int age, String address, int regNo) {
        return new PersonDetails(name, age, address, regNo);
    }

    // Static method to check if a person is an adult
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object using the static method
        PersonDetails details = PersonDetails.createPerson("Wachira Michael Miugo", 20, "Nakuru", 2301696);

        // Displaying the person's details using the non-static method
        details.displayDetails();

        // Checking if the person is an adult using the static method
        boolean adult = PersonDetails.isAdult(details.age);
        System.out.println("Is adult: " + adult);
    }
}
