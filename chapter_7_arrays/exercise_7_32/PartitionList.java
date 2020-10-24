/* Write a method that partitions the list
 * using the first element, a pivot.
 *
 * After the partition, the elements in the list
 * are rearranged.
 * All elements before the pivot are less or equal to the pivot
 * All elements after the pivot are greater than the pivot
 * The method returns the index where the pivot is located.
 *
 * {5, 2, 9, 3, 6, 8} -> {3, 2, 5, 9, 6, 8}
 *
 * Implement the method that takes at most list.length comparisons.
 *
 * Write a test program that prompts the user
 * to enter the size of the list and the contents of the list
 * and displays the list after the partition. (size and contents
 * are two separate inputs)
 */

/* ADDITIONAL NOTE: this solution is not good
 because I don't understand it.
 */

public class PartitionList {
	public static void main(String[] args) {
		
		int[] testList = {5, 2, 9, 3, 6, 8};
		int partitionedListPivotIndex = partition(testList);
		System.out.printf("%d", partitionedListPivotIndex);

	}

	public static int[] getUserInput() {
		return null;
	}

	public static int partition(int[] list) {

		int i = 0;
		for (int j = 1; j < list.length; j++) {
			if (list[j] < list[i]){
				int temp = list[j];
				System.arraycopy(list, i, list, i + 1, j - i);
				list[i] = temp;
				i++;
			}
		}
		return i;
	}

}
