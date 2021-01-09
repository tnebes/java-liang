/*
 * Write a program that creates a Random object
 * with the seed 1000
 * and displays the first 50 random ints between 0 and 100
 * using the nextInt(100) method.
 */

public class UseRandom {

	public static void main(String[] args) {
		final int SEED = 1000;
		final int NUMBER_OF_INTS = 50;
		final int INT_MAX = 100;

		java.util.Random rng = new java.util.Random(SEED);
		for (int i = 0; i < NUMBER_OF_INTS; i++) {
			System.out.printf("%d ", rng.nextInt(INT_MAX));
		}
	}

}
