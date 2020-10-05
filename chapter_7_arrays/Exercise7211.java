public class Exercise7211 {
	public static void main(String[] args) {
	
		int[] list = {1, 2, 3, 4, 5, 6};
		for (int i = 1; 1 < list.length; i++)
			list[i] = list[i-1];

		for (int i = 0; i < list.length; i++)
			System.out.printf("%d ", i);

	}
}

