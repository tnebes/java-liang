public class RandomShuffling {
	public static void main(String[] args) {
		
		int[] myList = new int[1000];

		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int) (Math.random() * myList.length);
		}

		for (int aNumber : myList) {
			System.out.printf("%d ", aNumber);
		}
		System.out.print("\n\n\n");

		for (int i = 0; i < myList.length; i++) {
			int j = (int) (Math.random() * myList.length);

			int temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
		}

		for (int aNumber : myList) {
			System.out.printf("%d ", aNumber);
		}
	}
}
