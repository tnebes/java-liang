/* Three dice are thrown at random
 * Write a program that shows all possible premutations
 * of the three dice
 * that yield the sum of nine.
 */

public class Dice {

	public static void main(String[] args) {
	
		int[][] dicePremutations = getDicePremutations();

		System.out.print("All premutations that yield 9 are: \n");

		for (int i = 0; i < dicePremutations.length; i++) {
			for (int j = 0; j < dicePremutations[i].length; j++) {
				System.out.printf("%d ", dicePremutations[i][j]);
			}
			System.out.print("\n");
		}
		System.out.printf("There are %d premutations that yield 9.\n",
			dicePremutations.length);
	}

	public static int[][] getDicePremutations() {
		/** returns a 2d array containing arrays
		 * whose sum equals to TARGET.
		 */
	
		final int DIE_MIN = 1, DIE_MAX = 6, TARGET = 9;
		int totalPremutations;
		int tempSum = 1;

		totalPremutations = (int) Math.pow(DIE_MAX, 3);
		System.out.printf("Total number of premutations is: %d\n",
				totalPremutations);
		int[][] allDicePremutations = new int[totalPremutations][3];
		int validPremutationCounter = 0;

		for (int i = DIE_MIN; i <= DIE_MAX; i++) {
			for (int j = DIE_MIN; j <= DIE_MAX; j++) {
				for (int k = DIE_MIN; k <= DIE_MAX; k++) {
					if (i + j + k == TARGET) {
						allDicePremutations[
							validPremutationCounter][0] = i;
						allDicePremutations[
							validPremutationCounter][1] = j;
						allDicePremutations[
							validPremutationCounter++][2] = k;
					}
				}
			}
		}
		int[][] dicePremutations = new int[validPremutationCounter][3];
		for(int i = 0; i < dicePremutations.length; i++) {
			dicePremutations[i] = allDicePremutations[i];
		}

		return dicePremutations;
	}
}

