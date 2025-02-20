package anudeep_corejava;
/**
 * Write a program using Vector to store the list of students details and print the details.
 */
import java.util.Vector;
class StudentInfo {
    String name;
    int rollNumber;

    // Constructor to initialize student details
    public StudentInfo(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to return student details as a string
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        // Create a Vector to store StudentInfo objects
        Vector<StudentInfo> students = new Vector<>();

        // Add student details to the vector
        students.add(new StudentInfo("Asavari", 101));
        students.add(new StudentInfo("Shreya", 102));
        students.add(new StudentInfo("Sanvi", 103));
        students.add(new StudentInfo("Pallavi", 104));

        // Print the details of all students
        System.out.println("Student Details:");
        for (StudentInfo student : students) {
            System.out.println(student);
        }
    }
}

/**Output:
 * Student Details:
Name: Asavari, Roll Number: 101
Name: Shreya, Roll Number: 102
Name: Sanvi, Roll Number: 103
Name: Pallavi, Roll Number: 104

 */
