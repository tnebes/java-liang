public class EvenNumberOfOnes {

	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		boolean[][] matrix = generateMatrix();
		printMatrix(matrix);
		if (checkEvenOnes(matrix))
			System.out.print("Every row and column has an even number of 1s.\n");
		else
			System.out.print("Not all rows and columns has an even number of 1s.\n");
	}

	public static boolean[][] generateMatrix() {
		final int MATRIX_SIZE = 6;
		boolean[][] matrix = new boolean[MATRIX_SIZE][MATRIX_SIZE];
//		java.util.Scanner input = new java.util.Scanner(System.in);
//		System.out.printf("Enter a %d-by-%d matrix row by row: ", MATRIX_SIZE, MATRIX_SIZE);
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				matrix[i][j] = input.nextByte() == 1 ? true : false;
//			}
//		}
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

	public static boolean checkEvenOnes(boolean[][] matrix) {
		return checkHorizontally(matrix) && checkVertically(matrix);
	}

	public static boolean checkHorizontally(boolean[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int counter = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j])
					counter++;
			}
			if (counter % 2 != 0)
				return false;
		}
		return true;
	}

	public static boolean checkVertically(boolean[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			int counter = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i])
					counter++;
			}
			if (counter % 2 != 0)
				return false;
		}
		return true;
	}

}
