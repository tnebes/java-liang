public class checkpoint_8_2_4 {
	public static void main(String[] args) {
		int[][] n = {{1, 2}, {2, 3}, };

		for (int[] i : n) {
			for (int j : i) {
				System.out.printf("%d ", j); // valid statement.
			}
		}

		// 3rd array not initialised according to .length
		System.out.printf("\nlength of array is %d\n",
			   n.length);
	}
}
