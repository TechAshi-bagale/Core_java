package anudeep_corejava;
/**
 * Write a program using TreeSet insert Integer values and print them.
 */
import java.util.TreeSet;

	public class IntegerTreeSet {
	    public static void main(String[] args) {
	        // Create a TreeSet to store integer values
	        TreeSet<Integer> intSet = new TreeSet<>();

	        // Add integer values to the TreeSet
	        intSet.add(45);
	        intSet.add(12);
	        intSet.add(78);
	        intSet.add(34);
	        intSet.add(23);

	        // Print the TreeSet
	        System.out.println("TreeSet contents (sorted): " + intSet);
	    }
	}

/**Output:
 * TreeSet contents (sorted): [12, 23, 34, 45, 78]
 */
