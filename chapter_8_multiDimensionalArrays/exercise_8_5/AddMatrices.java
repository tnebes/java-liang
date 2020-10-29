/* Write a method to add two matrices.
 * In order to be added, the two matrices must have the same dimensions
 * and the same or compatible types of elements.
 * Let c be the resulting matrix.
 * Write a test program that prompts the user to enter two 2x2 matrices
 * and displays their sum.
 */

import java.util.Locale; // required.

public class AddMatrices {
	public static void main(String[] args) {
		double[][][] matrix = getMatrix();
		double[][] summedMatrix = addMatrix(
			matrix[0], matrix[1]);
		printMatrix(summedMatrix);
	}

	/** returns 3d array containing NUMBER_OF_MATRICES matrices
	 * provided by the user. */
	public static double[][][] getMatrix() {
		final int NUMBER_OF_MATRICES = 2;
		final int MATRIX_COLUMN = 2;
		final int MATRIX_ROW = 2;
		java.util.Scanner input = new java.util.Scanner(System.in);
		input.useLocale(Locale.ENGLISH);

		double[][][] matrix = new double
			[NUMBER_OF_MATRICES][MATRIX_COLUMN][MATRIX_ROW];

		for (int i = 0; i < matrix.length; i++) {
			System.out.printf("Enter matrix%d: ", i);
			for (int j = 0; j < matrix[i].length; j++) {
				for (int k = 0; k < matrix[j].length; k++) {
					matrix[i][j][k] = input.nextDouble();
				}
			}
		}
		return matrix;
	
	}

	/** Adds the matrices. Quite limited method as the assignment states
	 * that this header must be used.
	 */
	public static double[][] addMatrix(double[][] a, double[][]b) {
		double[][] c = new double[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	
	}

	/** Prints a 2d array. */
	public static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.printf("%.2f ", matrix[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
