/* Write a method that returns a sorted string.
 * Write a test program that prompts the user to enter a string and displays the sorted string.
 *
 * Using bubblesort.
 *
 */

public class SortCharactersString {
	public static void main(String[] args) {

		System.out.printf("%s\n",
				sort("abc"));
		System.out.printf("%s\n",
				sort("This is a tESt."));
		System.out.printf("%s\n",
				sort("Hello there."));

	}

	public static String sort(String s) {
	
		char[] sortedChars = new char[s.length()];
		for (int i = 0; i < sortedChars.length; i++) {
			sortedChars[i] = Character.toLowerCase(s.charAt(i)); //cheating
		}

		// using bubblesort
		char temp;
		for (int i = 0; i < sortedChars.length; i++) {
			for (int j = sortedChars.length - 1; j > i; j--) {
				if (sortedChars[j] < sortedChars[j - 1]) {
					temp = sortedChars[j];
					sortedChars[j] = sortedChars[j - 1];
					sortedChars[j - 1] = temp;
				}
			}
		}
		String sortedString = "";
		for (int i = 0; i < sortedChars.length; i++)
			sortedString += sortedChars[i];

		return sortedString.trim(); //cheating
	}

}
