public class IdenticalArrays {

	/*
	 * Two-dimensional arrays are identical if they have the same contents. Write a
	 * test program that prompts the user to enter two 3x3 arrays of integers and
	 * displays whether the two are identical.
	 */

	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		final int MATRIX_SIZE = 3;
		int[][][] matrices = generateMatrices(MATRIX_SIZE);
		boolean areEqual = equals(matrices[0], matrices[1]);
		System.out.printf("%s", areEqual ? "The two arrays are identical.\n" : "The two arrays are not identical");
	}

	public static boolean equals(int[][] matrix1, int[][] matrix2) {
		// two arrays are identical if they have the same content
		// simplify
		int[] simpleMatrix1 = simplifyMatrix(matrix1);
		int[] simpleMatrix2 = simplifyMatrix(matrix2);
		sortArray(simpleMatrix1);
		sortArray(simpleMatrix2);
		
		// check
		for (int i = 0; i < simpleMatrix1.length; i++) {
			if (simpleMatrix1[i] != simpleMatrix2[i])
				return false;
		}
		return true;

	}

	public static int[][][] generateMatrices(int size) {
		int[][] m1 = new int[size][size];
		int[][] m2 = new int[size][size];
		java.util.Random rng = new java.util.Random();

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				int randomNumber = rng.nextInt(10);
				m1[i][j] = m2[i][j] = randomNumber;
			}
		}
		m2[rng.nextInt(m2.length)][rng.nextInt(m2[0].length)] += rng.nextInt(2);
		return new int[][][] { m1, m2 };
	}

	public static int[] simplifyMatrix(int[][] matrix) {
		int[] simplifiedMatrix = new int[matrix.length * matrix[0].length];
		int index = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				simplifiedMatrix[index++] = matrix[i][j];
			}
		}
		return simplifiedMatrix;
	}

	public static void sortArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
