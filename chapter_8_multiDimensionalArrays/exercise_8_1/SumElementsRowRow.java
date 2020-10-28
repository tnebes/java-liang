/* Write a method that returns the sum of all
 * elements in a specified row in a matrix
 * using the header
 *
 * Write a test program that reads a 3-by-4 matrix
 * and displays the sum of each row.
 */

import java.util.Locale;

public class SumElementsRowRow {
	public static void main(String[] args) {
	
		java.util.Scanner input = new java.util.Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		double[][] matrix = new double[3][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		double[] matrixRowSum = new double[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			matrixRowSum[i] = sumRow(matrix, i);
		}
		for (int i = 0; i < matrixRowSum.length; i++) {
			System.out.printf("Sum of elements at row %d is %.1f\n",
				i, matrixRowSum[i]);
		}

	}

	/** returns the sum of all the values in a given rowIndex of a
	 * 2d array.*/
	public static double sumRow(double[][] m, int rowIndex) {
		double sum = 0;
		for (int i = 0; i < m[rowIndex].length; i++) {
			sum += m[rowIndex][i];
		}
		return sum;
	}

}
