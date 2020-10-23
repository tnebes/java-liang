/* Write a method that merges two sorted lists
 * into a new sorted list.
 * Implement the method in a way that takes at most
 * list1.lenght + list2.length comparisons.
 * 
 * Write a test program that prompts the user to enter
 * two sorted lists and displays the merged list.
 */

/* NOTE: this solution does not fulfill the requirement of
 * the number of comparisons being lower than the sum of
 * the lengths of the arrays. sadface.
 */

public class MergeTwoSortedLists {
	public static void main(String[] args) {
	
		System.out.print("Enter list1 size and contents: ");
		int[] list1 = getUserInput();
		System.out.print("Enter list2 size and contents: ");
		int[] list2 = getUserInput();
		int[] mergedList = merge(list1, list2);
		
		System.out.print("The merged list is: ");
		for(int i = 0; i < mergedList.length; i++) {
			System.out.printf("%d ", mergedList[i]);
		}
		System.out.print("\n");
	}

	public static int[] getUserInput() {
		/** input from user in form of a list of numbers
		 * 0th element determines the size of the array
		 * all other elements are returned in form of
		 * an int array. */

		java.util.Scanner input = new java.util.Scanner(System.in);
		String userInput = input.nextLine();
		int whitespaceIndex = userInput.indexOf(" ");
		int[] numbers = new int[Integer.parseInt(
			userInput.substring(0, whitespaceIndex))];
		userInput = userInput.substring(whitespaceIndex + 1);

		for (int i = 0; i < numbers.length; i++) {
			if (userInput.contains(" ")) {
				whitespaceIndex = userInput.indexOf(" ");
				numbers[i] = Integer.parseInt(
					userInput.substring(0, whitespaceIndex));
				userInput = userInput.substring(whitespaceIndex + 1);		
			} else {
				numbers[i] = Integer.parseInt(userInput);
			}
		}
		return numbers;
	}

	public static int[] merge(int[] list1, int[] list2) {
		/** takes two sorted int arrays and returns a single
		 * merged and sorted int array */		
		
		// the number of comparisons this method does cannot exceed the
		// sum of the lenghts of the lists.
		int comparison = 0;
		int combinedListLength = list1.length + list2.length;
		int[] mergedList = new int[combinedListLength];

		// adjusting the lists so that we have predictable iterations
		// further on as we wish the larger list to be list1
		boolean firstLarger = false;
		if (list2.length > list1.length) {
			comparison++;
			firstLarger = true;
			int[] temp = list2;
			list2 = list1;
			list1 = temp;
		} else if (list1.length != list2.length) {
			comparison++;
			firstLarger = true;
		}

		int list1Index = 0, list2Index = 0;
		while (list1Index < list1.length && list2Index < list2.length) {
			comparison++;
			if (list1[list1Index] < list2[list2Index]) {
				comparison++;
				mergedList[list1Index + list2Index] = list1[list1Index++];
			} else {
				mergedList[list1Index + list2Index] = list2[list2Index++];
			}
		}

		comparison += 2; // to account for the while loop doing pretests.
		while (list1Index < list1.length) {
			comparison++;
			mergedList[list1Index + list2Index] = list1[list1Index++];
		}
		while (list2Index < list2.length) {
			comparison++;
			mergedList[list1Index + list2Index] = list2[list2Index++];
		}

		System.out.printf("Number of comparisons is %d. List length is %d. ",
			comparison, mergedList.length);
		return mergedList;
	}

}
