/* Write a test program that
 * prompts the user to enter 10 numbers
 * invokes the method
 * reverses the numbers
 * displays the numbers.
 * NOTE: I will not rewrite the method but will write a new one.
 */

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {

	// int[] testNumbers = {13, 564, 351, 623, 14, 71};
	
	java.util.Scanner input = new java.util.Scanner(System.in);

	System.out.print("Please enter 10 integers seperated by spaces.");
	int[] testNumbers = new int[10];
	for (int i = 0; i < testNumbers.length; i++) {
		testNumbers[i] = input.nextInt();
	}

	System.out.printf("Original array: %s\n Reversed array: %s",
			Arrays.toString(testNumbers),
			Arrays.toString(reverseArray(testNumbers)));

	}

	public static int[] reverseArray(int[] array) {
	
		int[] reversedArray = new int[array.length];
		for (int i = 0; i < reversedArray.length; i++) {
			reversedArray[(array.length - 1) - i] = array[i];
		}

		return reversedArray;

	}
}
