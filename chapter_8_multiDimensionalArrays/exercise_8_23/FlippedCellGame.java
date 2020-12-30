public class FlippedCellGame {

	/*
	 * Suppose you are given a 6-by-6 matrix filled with 
	 * 0s and 1s. All rows and all columns have an even number of 1s.
	 * Let the user flip one cell.
	 * 
	 * find the first row r and first column c
	 * where the even number of the 1s property is violated
	 */
	
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		boolean[][] matrix = generateMatrix();
		printMatrix(matrix);
		int[] columnRow = getColumnRow(matrix);
		int column = columnRow[0], row = columnRow[1];
		if (column != -1 && row != -1) {
			System.out.printf("The flipped cell is at (%d, %d).\n", column, row);
		} else {
			System.out.printf("No flipped cells.\n");
		}

	}

	public static boolean[][] generateMatrix() {
		final int MATRIX_SIZE = 6;
		boolean[][] matrix = new boolean[MATRIX_SIZE][MATRIX_SIZE];
		java.util.Random rng = new java.util.Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = rng.nextInt(2) == 1 ? true : false;
			}
		}
		return matrix;
	}

	public static void printMatrix(boolean[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.printf("%d ", matrix[i][j] == true ? 1 : 0);
			}
			System.out.print("\n");
		}
	}

	public static int[] getColumnRow(boolean[][] matrix) {
		return new int[] {checkHorizontally(matrix), checkVertically(matrix)};
	}

	public static int checkHorizontally(boolean[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int counter = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j])
					counter++;
			}
			if (counter % 2 != 0)
				return i;
		}
		return -1;
	}

	public static int checkVertically(boolean[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			int counter = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i])
					counter++;
			}
			if (counter % 2 != 0)
				return i;
		}
		return -1;
	}

}
