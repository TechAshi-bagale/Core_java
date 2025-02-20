package anudeep_corejava;
/**Write a program using exception handling to handle array index out of bounds.
 * */
public class ArrayIndexOutOfBoundExceptionExample {
	public static void main(String[] args) {
        try {
            // Creating an array of size 10
            int arr[] = new int[10];
            
            // Trying to assign value to an index out of bounds (index 20)
            arr[20] = 111;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching the exception and printing the exception message
            System.out.println(e);
        }
        // This line will always be executed
        System.out.println("hello");
    }
}
/** Output:
* java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 10
hello

*/



