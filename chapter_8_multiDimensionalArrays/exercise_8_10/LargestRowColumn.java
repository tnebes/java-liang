/* Write a program that randomly fills in 0s and 1s
 * into a 5x5 matrix, prints the matrix and
 * finds the first row and column with the most 1s.
 */

public class LargestRowColumn{
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		populateMatrix(matrix);
		printMatrix(matrix);
		int[] largest = findLargest(matrix);
		System.out.printf("The largest row index: %d\n", largest[0]);
		System.out.printf("The largest column index: %d\n", largest[1]);
	}

	/** populates a 2d array with randomly distributed 0s and 1s*/
	public static void populateMatrix(int[][] matrix) {
		java.util.Random rng = new java.util.Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rng.nextInt(2);
			}
		}
	}

	/** prints the contents of a 2d array.*/
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.printf("\n");
		}
	}

	/** finds the index of the row and column that contains the most
	 * 1s. Returns an an array that contains the index of the row and
	 * column. */
	public static int[] findLargest(int[][] matrix) {
		int[] rowColumn = new int[2];
		int counter = 0;
		int index = 0;
		int maximum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1)
					counter++;
			}
			if (counter > maximum) {
				maximum = counter;
				index = i;
			}
			counter = 0;
		}
		rowColumn[0] = index;
		counter = 0;
		index = 0;
		maximum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[j][i] == 1)
					counter++;
			}
			if (counter > maximum) {
				maximum = counter;
				index = i;
			}
			counter = 0;
		}
		rowColumn[1] = index;
		return rowColumn;
	}

}
