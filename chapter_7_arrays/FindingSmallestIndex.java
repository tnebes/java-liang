public class FindingSmallestIndex {
	public static void main(String[] args) {

		// the goal is to find the smallest index of the largest elements.
		// For these purposes I will create an array of size 50
		// This array will contain randomly generated ints of maximum
		// 10
		// The program will have to find the largest number with the
		// smallest index.
		
		int[] myList = new int[50];

		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int) (Math.random() * 11);
		}

		int maxNumber = 0;
		int lasti = 0;
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] > maxNumber) {
			       maxNumber = myList[i];	
			       lasti = i;
			}
		}

		System.out.printf("Largest number was %d with index %d", maxNumber, lasti);

	}
}
