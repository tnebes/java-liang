/* Write a method that tests whether the array
 * has four consecutive number with the same value
 * The program must prompt the user to enter the input size
 */

public class PatternRecognition {
	public static void main(String[] args) {

		final int SEQUENCE = 4;
		int[] inputList = getUserInput();

		if (isConsecutiveFour(inputList, SEQUENCE)) {
			System.out.printf("List contains %d consecutive values\n",
				SEQUENCE);
		} else {
			System.out.printf("List does not contain %d "
				+ "consecutive values\n", SEQUENCE);
		}

	}

	public static int[] getUserInput() {
		/** from an input that consists of a string,
		 * determines the size of array from first integer and then
		 * returns the rest of the integers as an array.*/

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter list: ");
		String stringIntegers = input.nextLine().trim();

		//get array size
		int arraySize = Integer.parseInt(
			stringIntegers.substring(0,
				stringIntegers.indexOf(" ")));
		int[] list = new int[arraySize];
		stringIntegers = stringIntegers.substring(
			stringIntegers.indexOf(" ") + 1);

		for (int i = 0; i < list.length; i++) {
			if (stringIntegers.contains(" ")) {
				list[i] = Integer.parseInt(
					stringIntegers.substring(0,
						stringIntegers.indexOf(" ")));
				stringIntegers = stringIntegers.substring(
					stringIntegers.indexOf(" ") + 1);
			} else {
				list[i] = Integer.parseInt(stringIntegers);
			}
		}
		return list;
	}

	public static boolean isConsecutiveFour(int[] list,
		int desiredSequence) {
		/** checks whether there exist X consecutive values
		 * anywhere in the array. Returns true if there are. */
		
		for (int i = 0; i < list.length; i++) {
			int counter = 0;
			for (int j = i; j < list.length; j++) {
				if (list[i] == list[j]) {
					counter++;
					if (counter == 4)
						return true;
				}
				else {
					break;
				}
			}
		}
		return false;
	}
}
