/* Write a method that averages all the
 * numbers in the major diagonal in an n*n matrix
 * of double values using the following header.
 *
 * public static double averageMajorDiagonal(double[][] m)
 *
 * Write a test program that reads a 4-by-4 matrix
 * and displays the average of all its elements on the major diagonal.
 */

import java.util.Locale;

public class AverageMajorDiagonal {
	public static void main(String[] args) {
		final int MATRIX_SIZE = 4;
		java.util.Scanner input = new java.util.Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		double[][] myMatrix = new double[MATRIX_SIZE][MATRIX_SIZE];
		for (int i = 0; i < myMatrix.length; i++) {
			for (int j = 0; j < myMatrix[i].length; j++) {
				myMatrix[i][j] = input.nextDouble();
			}
		}
		System.out.printf(
			"Average of the elements in the major diagonal is %.4f\n",
				averageMajorDiagonal(myMatrix));
	}

	/** returns the average of the major diagonal in an
	 * nxn array. */
	public static double averageMajorDiagonal(double[][] m) {
		double average = 0;
		for (int i = 0; i < m.length; i++) {
			average += m[i][i];
		}
		return average / m.length;
	}
}


