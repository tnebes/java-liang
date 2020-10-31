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
		java.util.Scanner input = new java.util.Scanner(System.in);
		final int MATRIX_ROWS = 3, MATRIX_COLUMNS = 3;
		int choice;

		int[][][] matrixCollection = new int[
			(int) Math.pow(2, MATRIX_ROWS * MATRIX_COLUMNS)]
			[MATRIX_ROWS][MATRIX_COLUMNS];
		populateMatrices(matrixCollection);

		do {
			System.out.printf("Enter a number between 0 and %d: ",
				matrixCollection.length - 1);
			choice = input.nextInt();
		} while (choice < 0 || choice >= matrixCollection.length);
		printMatrix(choice, matrixCollection);
	}

	/** populates the 3d array with permutations */
	public static void populateMatrices(int[][][] matrixCollection) {
		int number;
		for (int i = 0; i < matrixCollection.length; i++) {
			number = i;
			for (int j = matrixCollection[i].length - 1; j >= 0; j--) {
				for (int k = matrixCollection[i][j].length - 1; k >= 0; k--) {
					matrixCollection[i][j][k] = number % 2;
					number /= 2;
				}
				if (number == 0)
					break;
			}
		}
	}

	/** prints the contents of one matrix from a collection of matrices.*/
	public static void printMatrix(int choice, int[][][] matrixCollection) {
		for (int i = 0; i < matrixCollection[choice].length; i++) {
			for (int j = 0; j < matrixCollection[choice][i].length; j++) {
				System.out.printf("%c ",
					matrixCollection[choice][i][j] == 1 ? 'T' : 'H');
			}
			System.out.printf("\n");
		}
	}

}
