public class Exercise510 {
	public static void main(String[] args) {
		final int THE_MIN = 100;
		final int THE_MAX = 10000;
		int horizontalCounter = 0;

		for (int i = THE_MIN; i < THE_MAX; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.printf("%4d ", i);
				horizontalCounter++;
				if (horizontalCounter > 9) {
					horizontalCounter = 0;
					System.out.print("\n");
				}
			}
		}
		System.out.print("\n");
	}
}
