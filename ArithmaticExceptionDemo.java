package anudeep_corejava;
/**Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.
 * */

public class ArithmaticExceptionDemo {
	
	       public static void main(String[] args) {
	        int numerator = 10;      // Initialize numerator
	        int denominator = 0;     // Initialize denominator

	        try {
	            // Attempt to divide numerator by denominator
	            int res = numerator / denominator;
	            // Print the result if no exception occurs
	            System.out.println("Result: " + res);
	        } catch (ArithmeticException e) {
	            // Handle the ArithmeticException when division by zero occurs
	            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
	        }
	       
	       }
	       
}   
	     
	
/**
 * Output:
 * ArithmeticException caught: Division by zero is not allowed.

 */

