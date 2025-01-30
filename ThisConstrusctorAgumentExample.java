package anudeep_corejava;
/*Task:1. Write a Java Program  to pass  this keyword as argument in the constructor call.*/
     class Abc {
		ThisConstrusctorAgumentExample var;
		Abc ( ThisConstrusctorAgumentExample  var) {
			this.var=var;
		} 
		// Method to show
		void show()
		{
			System.out.println(" Count variable value : " + var.count );
		}
	  }
     public class ThisConstrusctorAgumentExample {
		int count =1;	//instance variable

		// Constructor that calls Abc Class constructor with 'this' keyword
		ThisConstrusctorAgumentExample() {
			// Passing 'this' (the current object) to the constructor of Abc Class
			Abc  obj = new  Abc (this);
			obj.show(); // Call the show method of the Abc class
		}

		public static void main(String[] args) {
			// Creating an instance of ThisConstrusctorAgumentExample which will invoke the constructor
			ThisConstrusctorAgumentExample example = new ThisConstrusctorAgumentExample();
		}
	}

	//OUTPUT

	/*

	 Count variable value : 1

	 */

