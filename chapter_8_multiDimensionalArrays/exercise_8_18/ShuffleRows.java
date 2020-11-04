/* Write a method that shuffles the rows in a two-dimensional int array
 * Write a test program that shuffles the following matrix */

public class ShuffleRows {
	public static void main(String[] args) {
		int[][] m = {{1,2}, {3, 4}, {5, 6}, {7, 8},	{9, 10}};
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%d ", m[i][j]);
			}
			System.out.print("\n");
		}
		shuffle(m);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%d ", m[i][j]);
			}
			System.out.print("\n");
		}
	}

	/** shuffles the rows of a 2d array.*/
	public static void shuffle(int[][] m) {
		int[] temp;
		java.util.Random rng = new java.util.Random();
		int random;
		for (int i = 0; i < m.length; i++) {
			for (int j = m.length - 1; j > 0; j--) {
				random = rng.nextInt(m.length);
				temp = m[i];
				m[i] = m[random];
				m[random] = temp;
			}
		}
	}

}
