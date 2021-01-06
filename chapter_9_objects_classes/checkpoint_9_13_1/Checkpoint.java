public class Checkpoint {

	private static int i = 0;
	private static int j = 0;

	public static void main(String[] args) {
		int i = 2;
		int k = 3;

		{
			int j = 3;
			System.out.printf("i + j is %d\n", i + j); // 5?
		}

		k = i + j; // 5?
		System.out.printf("k is %d\n j is %d", k, j); // 3, 0
	}

}
