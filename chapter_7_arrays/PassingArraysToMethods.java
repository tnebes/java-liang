public class PassingArraysToMethods {
	public static void main(String[] args) {
		
		printArray(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1, 0});

	}

	public static void printArray(int[] array) {
		for (int number : array) {
			System.out.printf("%d, ", number);
		}
		System.out.print("\n");
	}

}
