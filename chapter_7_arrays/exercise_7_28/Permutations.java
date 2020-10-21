/* Write a program that prompts the user
 * to enter 4 integers
 * and then displays all the possible ways
 * of arranging four integers.
 *
 * related to mathematical permutations.
 */

public class Permutations {

	public static int counter = 0; // bad idea.

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Please enter integers separated by spaces: ");
		int[] myIntegers = parseIntegers(input.nextLine());

		//getting the number of permutations to set up the array.
		int numOfPermutations = 1;
		for (int i = 1; i < myIntegers.length + 1; i++)
			numOfPermutations *= i;
		int[][] permutatedList = new int[numOfPermutations][myIntegers.length];
		getPermutations(myIntegers, myIntegers.length, permutatedList);

		for (int i = 0; i < permutatedList.length; i++) {
			for (int j = 0; j < permutatedList[i].length; j++) {
				System.out.printf("%d ", permutatedList[i][j]);
			}
			System.out.print("\n");
		}

		if (checkDuplicates(permutatedList))
			System.out.print("List contains duplicates.\n");
		else
			System.out.print("List contains no duplicates!\n");


	}

	public static int[] parseIntegers(String stringNumbers) {
		/** returns an array of integers from a string */
	
		// instead of using .split(" "), why not complicate our lives?
		// counting instances of whitespace to determine the number of integers.
		// bad idea.

		int whitespaceCounter = 0;
		for (int i = 0; i < stringNumbers.length(); i++) {
			if (stringNumbers.charAt(i) == ' ') {
				whitespaceCounter++;
				while (stringNumbers.length() - 1 > i 
					&& stringNumbers.charAt(i + 1) == ' ') {
					i++;
				}
			}
		}

		// + 1 because, usually, the whitespaces are between numbers
		int[] parsedIntegers = new int[whitespaceCounter + 1];

		// populating the array with parsed integers
		int whitespaceIndex;
		for (int i = 0; i < parsedIntegers.length; i++) {
			whitespaceIndex = stringNumbers.indexOf(" ");
			if (whitespaceIndex != -1) {
				parsedIntegers[i] = Integer.parseInt(
					stringNumbers.substring(0, whitespaceIndex));
				stringNumbers = stringNumbers.substring(
					whitespaceIndex + 1);
			} else {
				parsedIntegers[i] = Integer.parseInt(
					stringNumbers);
			}	
		}
		return parsedIntegers;
	}

	public static void getPermutations(int[] list,
		int listLength,
	   	int[][] permutatedList) {
		/** modifies a 2d array to contain all the permutations
		 * of the list.
		 * Based on Heap's algorithm */

		if (listLength == 1) {
			for (int i = 0; i < list.length; i++) {
				permutatedList[counter][i] = list[i];
			}
			counter++;
		} else
			getPermutations(list, listLength - 1, permutatedList);

		int temp;
		for (int i = 0; i < listLength - 1; i++) {
			if (listLength % 2 == 0) {
				temp = list[i];
				list[i] = list[listLength - 1];
				list[listLength - 1] = temp;
			} else {
				temp = list[0];
				list[0] = list[listLength - 1];
				list[listLength - 1] = temp;
			}
			getPermutations(list, listLength - 1, permutatedList);
		}
	}

	public static boolean checkDuplicates(int[][] list) {
		/** checks whether there exist any duplicate arrays in
		 * an 2d array. Returns false if there are no duplicates
		 * returns true if there are.
		 */

		int duplicateCounter = 0;

		for(int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				for (int k = list.length - 1; k < i; k--) {
					for (int l = 0; l < list[k].length; l++) {
						if (list[i][j] == list[k][l]) {
							duplicateCounter++;
						}
					}
					if (duplicateCounter == 4)
						return true;
					else
						duplicateCounter = 0;
				}
			}
		}
		return false;
	}

}
