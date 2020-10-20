//Prompt the user to enter a string
//count and display the number of both lowercase and uppercase vowels
//in the string.

import java.util.Arrays;

public class CountVowels {
	public static void main(String[] args) {
		
		final char[] vowels = {'a', 'e', 'i', 'o', 'u',
		  	'A', 'E', 'I', 'O', 'U'};

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Input a string to count the vowels:\n");
		String inputString = input.nextLine();

		int[] numberVowels = countVowels(inputString, vowels);

		for (int i = 0; i < numberVowels.length; i++) {
			System.out.printf("%c: %d\n", vowels[i], numberVowels[i]);
		}
		
	}

	public static int[] countVowels(String theString, char[] theVowels) {
		int[] numberOfVowels = new int[theVowels.length];

		for (int i = 0; i < theString.length(); i++) {
			for (int j = 0; j < theVowels.length; j++) {
				if (theString.charAt(i) == theVowels[j])
					numberOfVowels[j]++;
			}
		}
		return numberOfVowels;

	}
}
