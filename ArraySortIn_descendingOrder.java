package anudeep_corejava;
/*  Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B] */
	public class ArraySortIn_descendingOrder {


	public static void main(String[] args) {
		// Array of strings
		String[] letters = {"A", "X", "D", "Z", "Y", "C", "W", "B"};

		// Sorting the array in descending order 
		for (int i = 0; i < letters.length - 1; i++) {
			for (int j = 0; j < letters.length - 1 - i; j++) {
				if (letters[j].compareTo(letters[j + 1]) < 0) {
					// Swap if the current element is smaller than the next
					String temp = letters[j];
					letters[j] = letters[j + 1];
					letters[j + 1] = temp;
				}
			}
		}

		// Displaying the sorted array
		System.out.println("Sorted array in descending order:");
		for (String letter : letters) {
			System.out.print(letter + " ");
		}
	}
}
//	OUTPUT

/*
 Sorted array in descending order:
 Z Y X W D C B A  
 */


