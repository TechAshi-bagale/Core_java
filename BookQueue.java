package anudeep_corejava;
/**Write a program using ArrayDeque to add book names and add,delete the 
 * values from both ends of queue
 */
 
import java.util.ArrayDeque;
import java.util.Deque;

	public class BookQueue {
	    public static void main(String[] args) {
	        // Create an ArrayDeque to store book names
	        Deque<String> bookQueue = new ArrayDeque<>();

	        // Add book names to both ends of the queue
	        bookQueue.addFirst("To Kill a Mockingbird");
	        bookQueue.addLast("1984");
	        bookQueue.addFirst("The Great Gatsby");
	        bookQueue.addLast("Pride and Prejudice");

	        // Print the initial queue
	        System.out.println("Initial book queue: " + bookQueue);

	        // Remove a book from both ends of the queue
	        String firstBook = bookQueue.removeFirst();
	        String lastBook = bookQueue.removeLast();

	        // Print the books that were removed
	        System.out.println("Removed from first: " + firstBook);
	        System.out.println("Removed from last: " + lastBook);

	        // Print the updated queue
	        System.out.println("Updated book queue: " + bookQueue);
	    }
	}
/**
 * Output:
 * Initial book queue: [The Great Gatsby, To Kill a Mockingbird, 1984, Pride and Prejudice]
   Removed from first: The Great Gatsby
   Removed from last: Pride and Prejudice
   Updated book queue: [To Kill a Mockingbird, 1984]
 * 
 */
