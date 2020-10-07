import java.util.Arrays;

public class E73CountOccurrenceNumbers {
	public static void main(String[] args) {
		
		/* This program counts the occurrence of unique numbers
		 * in a given array. It prints out the results.
		 */

		if (args.length < 1) {
			System.out.println("Usage: java E73CountOccurrenceNumbers" + 
					"n1, n2, n3, n4, ... nn");
			System.exit(1);
		}

		// turning the strings into integers
		int[] theNumbers = new int[args.length];
		for (int i = 0; i < theNumbers.length; i++) {
			theNumbers[i] = Integer.parseInt(args[i]);
		}
		System.out.printf("%s\n", Arrays.toString(theNumbers));

		int[] listOfUniqueNumbers = new int[theNumbers.length];
		int uniqueNumbersIndex = 0;
		// note(tnebes) populating the unique number array
		for (int i = 0; i < theNumbers.length; i++) {
			// the 0s are considered to be the end of input
			if (theNumbers[i] == 0) {
				break;
			} else {
				boolean tempAddToArray = true;
				for (int j = 0; j < listOfUniqueNumbers.length; j++) {
					if (theNumbers[i] == listOfUniqueNumbers[j]) {
						tempAddToArray = false;
						break;
					}
				}
				if (tempAddToArray) {
					listOfUniqueNumbers[uniqueNumbersIndex++] = theNumbers[i];
				}
			}

		}
		System.out.printf("%s\n", Arrays.toString(listOfUniqueNumbers));
		
		// counting occurence

		for (int i = 0; i < listOfUniqueNumbers.length; i++) {
			int aUniqueNumber = listOfUniqueNumbers[i];
			if (aUniqueNumber == 0)
				break;
			int numberOfOccurrences = 0;
			for (int j = 0; j < theNumbers.length; j++) {
				if (aUniqueNumber == theNumbers[j])
					numberOfOccurrences++;

			}
			if (numberOfOccurrences == 1) {
				System.out.printf("The number %d appears %d time.\n", aUniqueNumber,
					       numberOfOccurrences);
			}
			else if (numberOfOccurrences > 1) {
				System.out.printf("The number %d appears %d times.\n", aUniqueNumber,
					       numberOfOccurrences);
			} 
		}
	}
}
