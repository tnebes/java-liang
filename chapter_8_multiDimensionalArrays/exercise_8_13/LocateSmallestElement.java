/* Write a method that returns the location of the
 * smallest element in a 2d array.
 * The return value is a 1d array that contains two elements.
 * These two elements indicate the row and column indices of
 * the smallest element in the 2d array.
 * Write a test program that prompts the user to enter a 2d
 * array and displays the location of the smallest element in
 * the array.
 */

import java.util.Locale;

public class LocateSmallestElement {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		double[][] array;
		System.out.print("Enter the number of rows " +
			"and columns of the array: ");
		int[] arraySize = new int[2];
		for (int i = 0; i < arraySize.length; i++) {
			arraySize[i] = input.nextInt();
		}
		array = new double[arraySize[0]][arraySize[1]];
		System.out.print("Enter the array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		int[] smallestIndices = locateSmallest(array);
		System.out.printf("The location of the smallest element is(%d, %d)\n",
			smallestIndices[0], smallestIndices[1]);


	}

	/** returns the indices of the smallest element of a 2d array*/
	public static int[] locateSmallest(double[][] a) {
		int[] indices = {0, 0};
		double smallest = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < smallest) {
					smallest = a[i][j];
					indices[0] = i;
					indices[1] = j;
				}
			}
		}
		return indices;
	}

}
