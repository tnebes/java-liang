public class ReturningAndReversingArray {
	public static void main(String[] args) {
		
		int[] randomList = new int[10];

		for (int i = 0; i < randomList.length; i++) {
			randomList[i] = (int) (Math.random() * 500);
		}

		int[] reversedList = reverse(randomList);

		for (int number : reversedList) {
			System.out.printf("%d, ", number);
		}
		System.out.print("\n");


	}

	public static int[] reverse(int[] list) {

		int[] result = new int[list.length];

		for (int i = 0, j = result.length - 1;
			i < list.length; i++, j--) {
				result[j] = list[i];
			}

		return result;
	}
}
