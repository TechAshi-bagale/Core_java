package anudeep_corejava;
/**Create a parent class called "Person" with attributes such as name, age, and
 *  a method called "speak". Create a child class called "Student" that
 *   inherits from Person and has an additional attribute called "grade" and a 
 *   method called "study". Create an object of the Student class
 *    and call both the "speak" and "study" methods.
 * */


/*
  Create a parent class called "Person" with attributes such as name, age, and a method called "speak".
  Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and
  a method called "study". 
  Create an object of the Student class and call both
  the "speak" and "study" methods.
*/

//Parent Class
class Person{

	// Attributes 
	String name = "Asavari";
	int age = 21;

	//Method to speak
	public void speak()
	{
		System.out.println("Person is speaking.....");
	}	
}

//Child Class
class Student extends Person{

	//  Additional attribute of student grade
	String Grade = "Grade A+";

	//Method to study
	public void study() {
		System.out.println("Student is studying.....");
		System.out.println("Student Name : "+name );
		System.out.println( "Student Grade : " + Grade);
	}
}

public class Inheritance_Example {

	public static void main(String[] args) {

		// Create an object of the Student class
		Student obj = new Student();

		// Call both the speak and study methods
		obj.speak();
		obj.study();

	}

}

//OUTPUT
/*

 Person is speaking.....
 Student is studying.....
 Student Name : Asavari
 Student Grade: Grade A+

 */
 
