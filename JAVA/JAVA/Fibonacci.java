/*This is a program designed to find the sum of all even valued numbers in the fibonacci sequence
 * that  do not exceed 4 million.
 * It then displays those values.
 */
package JAVA;

//Creating a class
public class Fibonacci {

    // Method to calculate the sum of all even-valued terms in the Fibonacci
    // sequence
    // whose values do not exceed four million
    public static long sumFibonacci(int limit) {
        int firstNumber = 1, secondNumber = 2;
        long sum = 0;

        while (firstNumber <= limit) {
            if (firstNumber % 2 == 0) {
                sum += firstNumber;
            }
            // compute the next term
            int nextTerm = firstNumber + secondNumber;
            // update terms
            firstNumber = secondNumber;
            secondNumber = nextTerm;
        }

        return sum;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int limit = 4000000; // specifying the limit
        long sum = sumFibonacci(limit);

        // Displaying the sum of all even valued terms in the sequence whose value do
        // not exceed 4 million
        System.out.println(
                "The sum of all even-valued terms in the Fibonacci sequence whose values do not exceed four million is: "
                        + sum);
    }
}
