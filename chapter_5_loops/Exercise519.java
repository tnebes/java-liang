public class Exercise519 {
	public static void main(String[] args) {
		final int REPETITION = 8;
		for (int i = 0; i < REPETITION; i++) {
			for (int k = 0; k <= REPETITION - i; k++) {
				System.out.printf("%6s", "");
			}
			boolean hasReversed = false;
			for (int j = 0; j >= 0; ) {
				System.out.printf("%5d ", (int) Math.pow(3, j));
				if (j >= i) {
					hasReversed = true;
				}
				if (hasReversed) {
					j--;
				}
				else {
					j++;
				}
			}
		System.out.print("\n");
		}
	}
}
