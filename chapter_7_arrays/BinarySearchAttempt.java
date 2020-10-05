public class BinarySearchAttempt {
	public static void main(String[] args) {

		//implementing a binary search for a specific list
		int[] myList = new int[5000];

		for(int i = 0; i < myList.length; i++) {
			myList[i] = i;
		}

		System.out.printf("%d", binarySearch(myList, 327));
		System.out.printf("%d", binarySearch(myList, 5001));


	}
	
	public static int binarySearch(int[] searchList, int searchedValue) {
		/** a primitive way of finding a number in an ordered list
		 */
		int low = 0;
		int high = searchList.length - 1;
		int mid;

		while(high >= low) {
			mid = (low + high) / 2;
			if (searchedValue == searchList[mid])
				return mid;
			else if (searchedValue > searchList[mid]) {
				low = mid + 1;
			}
			else
				high = mid - 1;
		}
		return -low - 1; //using this syntax lets me know where the key would be inserted in
		//the list. dunno what the practical application of this is.
	}
}
