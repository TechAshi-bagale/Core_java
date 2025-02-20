package anudeep_corejava;
/**Write a program demonstrating multiple catch statements and finally block.*/
public class MultipleCatchBlock {
	

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        try {
	            
	            int arr[] = new int[10]; // Initialize an array with 10 elements
	            arr[20] = 111; // Attempt to access an index out of bounds, causing ArrayIndexOutOfBoundsException
	        }

	        catch (ArithmeticException e) {
	            // Handle ArithmeticException
	        	System.out.println(e);
	        }
	        catch (NullPointerException e) {
	            // Handle NullPointerException
	            System.out.println("Null pointer exception");
	        }
	        catch (NumberFormatException e) {
	            // Handle NumberFormatException
	            System.out.println("NumberFormatException");
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            // Handle ArrayIndexOutOfBoundsException
	            System.out.println("ArrayIndexOutOfBoundsException");
	        }
	        catch (Exception e) {
	            // Handle any other exceptions
	            System.out.println("Global Exception");
	        }
	        finally {
	            // This block will always execute
	            System.out.println("Finally block");
	        }

	    }

	}
/** Output:
 * ArrayIndexOutOfBoundsException
Finally block

 * 
 */
