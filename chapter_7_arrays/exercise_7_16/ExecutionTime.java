/* Write a program that
 * creates an array of numbers
 * from 1 to 100,000,000 in ascending order.
 * Display the execution time of
 * linearSearch
 * and binarySearch.
 * Display the execution time of invoking both searches for
 * 1, 25,000,000, 50,000,000, 75,000,000, 100,000,000,000
 */

public class ExecutionTime {
	public static void main(String[] args) {

	long startTime, endTime, executionTime;

	int[] myList = new int[100000000];

	for (int i = 0; i < myList.length; i++) {
			myList[i] = i + 1;
	}

	int[] searchList = {1, 25000000, 50000000, 75000000, 100000000};

	startTime = System.nanoTime();
	for (int i = 0; i < searchList.length; i++) {
		System.out.printf("Found at index: %d\n", linearSearch(myList, searchList[i]));
	}
	endTime = System.nanoTime();
	executionTime = endTime - startTime;
	System.out.printf("search took: %d\n", executionTime);

	startTime = System.nanoTime();
	for (int i = 0; i < searchList.length; i++) {
		System.out.printf("Found at index: %d\n", binarySearch(myList, searchList[i]));
	}
	endTime = System.nanoTime();
	executionTime = endTime - startTime;
	System.out.printf("search took: %d\n", executionTime);

	}

	public static int linearSearch(int[] list, int key){
		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] list, int key){
		int low = 0;
		int high = list.length - 1;
		
		//sort the list first, ascending.
		//doesn't need to be done here
		//as the arrays will be made in
		//ascending order :-)


		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -1;
	}
}
