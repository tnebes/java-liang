/* Write a method to multiply two matrices.
 * Each element c(ij) is a(i1) * b(1j) + a(i2) * b(2j) ... 
 *
 * * Cij = Ai1 * B1j + A12 * B2j + Ai3 * B3j
 *
 * Write a test program that prompts the user to enter two 3x3 matrices
 * and displays their product.
 */

import java.util.Locale; // required 

public class MultiplyMatrices {
	public static void main(String[] args) {
		double[][][] matrices = getMatrix();
		double[][] multipliedMatrix = multiplyMatrix(
				matrices[0], matrices[1]);
		printMatrix(multipliedMatrix);
	}

	/** returns 3d array containing NUMBER_OF_MATRICES matrices
	 * provided by the user. */
	public static double[][][] getMatrix() {
		final int NUMBER_OF_MATRICES = 2;
		final int MATRIX_COLUMN = 3;
		final int MATRIX_ROW = 3;
		java.util.Scanner input = new java.util.Scanner(System.in);
		input.useLocale(Locale.ENGLISH);

		double[][][] matrix = new double
			[NUMBER_OF_MATRICES][MATRIX_COLUMN][MATRIX_ROW];

		for (int i = 0; i < matrix.length; i++) {
			System.out.printf("Enter matrix%d: ", i);
			for (int j = 0; j < matrix[i].length; j++) {
				for (int k = 0; k < matrix[i][j].length; k++) {
					matrix[i][j][k] = input.nextDouble();
				}
			}
		}
		return matrix;
	
	}

	/** multiplies the matrix according to the formula given in the header
	 * of this file. Returns the multiplied matrix. */
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
	
		double sum = 0;
		double[][] c = new double[a.length][a[0].length];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				int k = 0;
				while (k < c[i].length) {
					sum += a[i][k] * b[k][j];
					k++;
				}
				c[i][j] = sum;
				sum = 0;
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
