/* An array is sorted with constant interval if its elements
 * are arranged in an ascending order
 * and there is a constnt difference
 * between adjacent elements.
 * Write a method that returns true
 * if the array is sorted with a constant interval
 *
 * Write a test program that prompts the user
 * to enter a list of integers
 * The first number indicates the number of elements in the list.
 */

import java.util.Arrays; // remove this

public class SortedConstantInterval {
	public static void main(String[] args) {
	
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Enter list: ");
		String listInput = input.nextLine();

		int[] integerInput = parseIntegers(listInput);

		if (isSortedConstantInterval(integerInput))
			System.out.print("The list is sorted.\n");
		else
			System.out.print("The list is not sorted.\n");

	}

	public static int[] parseIntegers(String stringInput) {
		/** finds all the integers in a string and returns
		 * them
		 */
	
		int whiteSpacePosition = stringInput.indexOf(" ");

		int[] parsedIntegers = new int[Integer.parseInt(
				stringInput.substring(
				0, whiteSpacePosition))];
		stringInput = stringInput.substring(whiteSpacePosition + 1);

		for (int i = 0; i < parsedIntegers.length; i++) {
			whiteSpacePosition = stringInput.indexOf(" ");
			if (whiteSpacePosition != -1) {
				parsedIntegers[i] = Integer.parseInt(
					stringInput.substring(0, whiteSpacePosition));
				stringInput = stringInput.substring(whiteSpacePosition + 1);
			} else
				parsedIntegers[i] = Integer.parseInt(stringInput);
		}

		return parsedIntegers;
	}

	public static boolean isSortedConstantInterval(int[] list) {
		/** returns bool depending on whether the array is
		 * sorted in ascending order and if there exists
		 * a constant difference defined as the difference
		 * between the 1st and 0th element
		 */

		int constantDifference = list[1] - list[0];
		//ensuring ascending order
		if (constantDifference < 0)
			return false;
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i + 1] - list[i] != constantDifference)
				return false;
		}
		return true;
	}
}
