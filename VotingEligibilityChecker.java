package anudeep_corejava;
/**
 * VotingEligibilityChecker
 * This program checks whether a candidate is eligible for voting.
 * It takes the candidate's age as input and displays the eligibility status.
 */
import java.util.Scanner; // Importing the Scanner class for user input
	public class VotingEligibilityChecker {

	    public static void main(String[] args) {
	        // Create a Scanner object for taking input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Declare a variable 
	        int age;

	        // enter the candidate's age
	        System.out.print("Enter the candidate's age: ");
	        age = scanner.nextInt(); // Read integer input for the age

	        // Check if the candidate is eligible for voting
	        if (age >= 18) {
	            System.out.println("The candidate is eligible for voting.");
	        } else {
	            System.out.println("The candidate is not eligible for voting.");
	        }
	        
	        
	    }
	}
/*Output:
 * Enter the candidate's age: 15
 * The candidate is not eligible for voting. 
 * Enter the candidate's age: 19
 * The candidate is eligible for voting.
 */

