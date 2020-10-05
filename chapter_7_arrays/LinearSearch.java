public class LinearSearch {
	public static int linearSearch(int[] list, int key) {
		// looks for a key in a list and returns the index. If no index is found
		// return -1
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;

	}
	public static void main(String[] args) {
		int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
		int i = linearSearch(list, 4);
		int j = linearSearch(list, -4);
		int k = linearSearch(list, -3);
		System.out.printf("%d, %d, %d", i, j, k);
	}
}
