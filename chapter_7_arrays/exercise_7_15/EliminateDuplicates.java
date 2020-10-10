/* Write a method that returns a new array by
 * eliminating the duplicate values in the array
 * using the method header below.
 * Write a test program that reads in 10 ints
 * invokes the method
 * displays the distinct numbers separated by exactly one space.
 */

import java.util.Arrays;

public class EliminateDuplicates {
	public static void main(String[] args) {
		
		// int[] testNumbers = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
		
		java.util.Scanner input = new java.util.Scanner(System.in);

		int[] testNumbers = new int[10];
		System.out.print("Please enter 10 integers: ");
		for (int i = 0; i < testNumbers.length; i++) {
			testNumbers[i] = input.nextInt();
		}

		System.out.printf("Original list: %s\nNew List: ",
				Arrays.toString(testNumbers));
		int[] newList = eliminateDuplicates(testNumbers);
		for (int i = 0; i < newList.length; i++) {
			System.out.printf("%d ", newList[i]);
		}
		
	}

	public static int[] eliminateDuplicates(int[] list) {
		int[] newList = new int[list.length];

		int newListIndex = 0;
		for (int i = 0; i < list.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < newList.length; j++) {
				if (list[i] == newList[j]) {
				duplicate = true;
				break;
				}
			}
			if (!duplicate) {
				newList[newListIndex++] = list[i];
			}
		}
		// let's clean up the list to remove the ugly zeroes.

		int nonZeroCounter = 0;
		for (int i = 0; i < newList.length; i++) {
			if (newList[i] != 0)
				nonZeroCounter++;
		}
		int[] tempList = new int[nonZeroCounter];
		int tempIndex = 0;
		for (int i = 0; i < newList.length; i++) {
			if (newList[i] != 0) {
				tempList[tempIndex++] = newList[i];
			}
		}

		newList = tempList;
		return newList;
	}
}
