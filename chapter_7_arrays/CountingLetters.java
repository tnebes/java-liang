public class CountingLetters {
	public static void main(String[] args) {

		char[] chars = createArray(); // my userdefined method

		System.out.println("The lowercase letters are:");
		displayArray(chars);

		int[] counts = countLetters(chars);

		System.out.printf("\nThe occurences of each letter are:");
		displayCounts(counts);
	}

	public static char[] createArray() {

		char[] chars = new char[100];

		for (int i = 0; i < chars.length; i++) {
			chars[i] = getRandomLowerCaseLetter();
			/* (tnebes) NOTE: instead of using RandomCharacter I could have made inside
			 * the for loop an instantiation of the Math.random() method whereby I would
			 * multiply the return of the method with the (int) of 'Z' ... or some magic
			 * like that. this is more elegant however.
			 */
			// (tnebes) NOTE: this was done in a previous exercise.
		}
		return chars;
	}


	public static void displayArray(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			// what does this do???
			if ((i + 1) % 20 == 0) // if 20 chars have been printed, print the char and a new line
				// this type of printing is useful when i want to print stuff in lines.
				// just use modulo lmao
				System.out.println(chars[i]);
			else
				System.out.print(chars[i] + " ");
		}
	}

	public static int[] countLetters(char[] chars) {
		int[] counts = new int[26];

		for (int i = 0; i < chars.length; i++) {
			counts[chars[i] - 'a']++; //what
		}

		return counts;
	}

	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if ((i + 1) % 10 == 0)
				System.out.println(counts[i] + " " + (char)(i + 'a'));
			else
				System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
		}
	}

	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}
}
