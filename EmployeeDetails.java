/*Write a Java program to take Employee id,name,address & salary from user and
 * display on to screen.*/
package anudeep_corejava;
import java.util.Scanner; // Importing Scanner class for user input

	/**
	 * EmployeeDetails class is used to capture and display employee information.
	 */
	
	public class EmployeeDetails {
	    public static void main(String[] args) {
	        // Create a Scanner object to take input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Declare variables to store employee details
	        int employeeId;
	        String employeeName;
	        String employeeAddress;
	        double employeeSalary;

	        // Prompt user to enter employee details
	        System.out.print("Enter Employee ID: ");
	        employeeId = scanner.nextInt(); // Read integer input
	        
	        scanner.nextLine(); // Consume the newline left by nextInt

	        System.out.print("Enter Employee Name: ");
	        employeeName = scanner.nextLine(); // Read string input

	        System.out.print("Enter Employee Address: ");
	        employeeAddress = scanner.nextLine(); // Read string input

	        System.out.print("Enter Employee Salary: ");
	        employeeSalary = scanner.nextDouble(); // Read double input

	        // Display employee details
	        System.out.println("\n--- Employee Details ---");
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Employee Name: " + employeeName);
	        System.out.println("Employee Address: " + employeeAddress);
	        System.out.println("Employee Salary: " + employeeSalary);

	        
	  }
	    
	}
/** Output:
 * Enter Employee ID: 432
 * Enter Employee Name: Asavari Bagale
 * Enter Employee Address: Akkalkot,Solapur
 * Enter Employee Salary: 100000 
 */
	


