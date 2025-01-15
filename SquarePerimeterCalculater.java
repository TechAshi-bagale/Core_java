package anudeep_corejava;
import java.util.Scanner; // Importing the Scanner class for user input

/**
 * SquarePerimeterCalculator
 * This program calculates the perimeter of a square.
 * It takes the length of one side of the square as input from the user and displays the perimeter.*/


public class SquarePerimeterCalculater {

	public static void main(String[] args) {

        // Create a Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare a variable to store the side length of the square
        double sideLength;

        // Prompt the user to enter the length of one side of the square
        System.out.print("Enter the length of one side of the square: ");
        sideLength = scanner.nextDouble(); // Read double input for the side length

        // Calculate the perimeter of the square
        double perimeter = 4 * sideLength;

        // Display the calculated perimeter
        System.out.println("\n--- Square Perimeter ---");
        System.out.println("Length of one side: " + sideLength);
        System.out.println("Perimeter of the square: " + perimeter);

    }
}
/* Output:
 * Enter the length of one side of the square: 4.5

--- Square Perimeter ---
Length of one side: 4.5
Perimeter of the square: 18.0
 */

