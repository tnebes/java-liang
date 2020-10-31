/* Nine coins are placed in a 3x3 matrix.
 * The state of the coins can be represented with
 * values 0 (heads) 1 (tails)
 * There are a total of 512 possibilities. Each decimal number
 * up to 511 represents any of all of the states of the matrix.
 * 
 * Write a program that prompts the user to enter a number
 * between 0 and 511
 * and displays the corresponding matrix with the charcters H and T.
 */

public class NineHeadsTails {
	public static void main(String[] args) {
		final int MATRIX_ROWS = 3, MATRIX_COLUMNS = 3;
		int[][][] matrixCollection = new int[
			Math.pow(MATRIX_ROWS * MATRIX_COLUMNS, 2)]
			[MATRIX_ROWS][MATRIX_COLUMNS];
		populateMatrices(matrixCollection);
	}

	/** populates the 3d array with permutations */
	public static void populateMatrices(int[][][] matrixCollection) {
		int divider = 0;
		for (int i = 0; i < matrixCollection.length; i++) {
			for (int j = 0; j < matrixCollection[i].length; j++) {
				divider = i;
				for (int k = 0; k < matrixCollection[k].length; k++) {
					if (divider != 0) {
											
					} else {
						matrixCollection[i][j][k] = 0;
						break;
					}
				}
			}
		}
	}
}
