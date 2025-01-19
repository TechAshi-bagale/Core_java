package anudeep_corejava; 
/*Write a java program to check given number is perfect number or not*/

import java.util.Scanner; // Importing the Scanner class for user input

public class PerfectExample { // Class declaration

    public static void main(String[] args) {
        int num, sum = 0; // Declare variables: num for the input number and sum for storing the sum of divisors

        // Prompt the user to enter a number
        System.out.println("Enter any number");

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read the integer input for checking if it's a perfect number
        num = sc.nextInt();

        // Loop through all numbers from 1 to (num - 1) to find divisors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) { // Check if i is a divisor of num
                sum = sum + i; // Add the divisor to the sum
            }
        }

        // Check if the sum of divisors equals the original number
        if (num == sum) {
            // If true, the number is a perfect number
            System.out.println("number " + num + " is Perfect_No ");
        } else {
            // If false, the number is not a perfect number
            System.out.println("number " + num + " is not Perfect_No ");
        }

        
    }
}
/** Output: Enter any number 6
 * number 6 is Perfect_No 
 * Enter any number 8
 * number 8 is not Perfect_No 
*/