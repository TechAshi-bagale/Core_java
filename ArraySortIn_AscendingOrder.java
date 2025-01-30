package anudeep_corejava;
/* 1.Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20] */

	public class ArraySortIn_AscendingOrder {
		public static void main(String[] args) {
			// Array of integers
			int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};

			// Sorting the array in ascending order 
			for (int i = 0; i < numbers.length - 1; i++) {
				for (int j = 0; j < numbers.length - 1 - i; j++) {
					if (numbers[j] > numbers[j + 1]) {
						// Swap if the current element is greater than the next
						int temp = numbers[j];
						numbers[j] = numbers[j + 1];
						numbers[j + 1] = temp;
					}
				}
			}

			// Displaying the sorted array
			System.out.println("Sorted array in ascending order:");
			for (int num : numbers) {
				System.out.print(num + " ");
			}
		}
	}
	//OUTPUT
	/*
	 Sorted array in ascending order:
	 12 20 35 45 56 67 78 78 89 
	*/
	
