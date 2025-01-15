/* LeapYearChecker
		 * This program checks whether a given year is a leap year or not.
		 *  It takes a year as input from the user and displays the result.
		 */
package anudeep_corejava;
import java.util.Scanner; // Importing the Scanner class for user input

	
		public class LeapYearChecker {

		    public static void main(String[] args) {
		        // Create a Scanner object for taking input from the user
		        Scanner scanner = new Scanner(System.in);

		        // Declare a variable to store the year
		        int year;

		        // Prompt the user to enter a year
		        System.out.print("Enter a year: ");
		        year = scanner.nextInt(); // Read integer input for the year

		        // Check if the year is a leap year
		        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		            System.out.println(year + " is a leap year.");
		        } else {
		            System.out.println(year + " is not a leap year.");
		        }

		        // Close the Scanner object to free resources
		        scanner.close();
		    }
		

	}
/*output:
		Enter a year: 2002
		2002 is not a leap year.*/

