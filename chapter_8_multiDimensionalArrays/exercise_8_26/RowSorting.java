public class RowSorting {

	/*
	 * Implement a method to sort the rows in a two-dimensional array.
	 * A new array is returned and the original array is intact.
	 * 
	 * Write a test program that prompts the user to enter a 4x4 matrix
	 * of double values and displays a new row-sorted matrix.
	 */
	
	public static void main(String[] args) {

		solve();

	}
	
	public static void solve() {
		final int MATRIX_SIZE = 4;
		double[][] matrix = generateMatrix(MATRIX_SIZE);
		printMatrix(matrix);
		double[][] sortedMatrix = sortRows(matrix);
		printMatrix(sortedMatrix);
		
	}
	
	public static void printMatrix(double[][] matrix) {
		for (double[] i : matrix) {
			for (double j : i) {
				System.out.printf("%f ", j);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	
	public static double[][] generateMatrix(int size) {
		double[][] matrix = new double[size][size];
		java.util.Random rng = new java.util.Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rng.nextDouble();
			}
		}
		return matrix;
	}
	
	public static double[][] sortRows(double[][] originalMatrix) {
		// copy array first to preserve the original
		double[][] sortedMatrix = new double[originalMatrix.length][originalMatrix[0].length];
		for (int i = 0; i < sortedMatrix.length; i++) {
			for (int j = 0; j < sortedMatrix[i].length; j++) {
				sortedMatrix[i][j] = originalMatrix[i][j];
			}
		}
		// sort
		for (int i = 0; i < sortedMatrix.length; i++) {
			double temp = 0;
			for (int j = 0; j < sortedMatrix[i].length; j++) {
				for (int k = sortedMatrix[i].length - 1; k > j; k--) {
					if (sortedMatrix[i][j] > sortedMatrix[i][k]) {
						temp = sortedMatrix[i][j];
						sortedMatrix[i][j] = sortedMatrix[i][k];
						sortedMatrix[i][k] = temp;
					}
				}
			}
		}
		return sortedMatrix;
	}

}
