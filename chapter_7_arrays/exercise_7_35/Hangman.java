/* Write a hangman game that randomly generates
 * a word and prompts the user to guess one letter
 * at a time.
 * Each leter in the word is displayed as an asterisk.
 * When the user makes a correct guess, the actual
 * letter is displayed. When the user finishes a word,
 * display the number of misses and ask the user whether
 * to continue to play with another word.
 * Declare an array to store words.
 */

import java.util.Scanner;

public class Hangman {
	public static void main(String[] args) {
	
		String[] words = {"directory", "write", "amazing", "games",
			"memory", "bytes", "corona virus"};
		Scanner input = new Scanner(System.in);
		
		while (true) {
			guess(words);
			System.out.print("Do you want to guess another word? y/n ");
			if (input.next().charAt(0) != 'y')
				break;
		}
		System.out.print("Thank you and goodybe.");

	}

	public static void guess(String[] wordList) {
	
		java.util.Random rng = new java.util.Random();
		java.util.Scanner input = new java.util.Scanner(System.in);
		String word = wordList[rng.nextInt(wordList.length)];
		char[] wordCharArray = new char[word.length()];
		int usedLetterCounter = 0;
		char[] usedLetters = new char[26]; // maybe we could use one of the arrays above? 
		int miss = 0;

		for (int i = 0; i < wordCharArray.length; i++) {
			wordCharArray[i] = Character.toLowerCase(word.charAt(i));
		}
		char[] solvedCharArray = new char[wordCharArray.length];
		for (int i = 0; i < solvedCharArray.length; i++) {
			if (wordCharArray[i] != ' ')
				solvedCharArray[i] = '*';
			else
				solvedCharArray[i] = ' ';
		}

		char guess;

		while (true) {

			System.out.print("(Guess) Enter a letter in word ");	
			for (int i = 0; i < solvedCharArray.length; i++)
				System.out.printf("%c", solvedCharArray[i]);
			System.out.print(" > ");

			boolean letterUsed = false;
			while (true) {
				guess = input.next().charAt(0);
				for (int i = 0; i < usedLetters.length; i++) {
					if (guess == usedLetters[i]) {
						letterUsed = true;
						break;
					}
				}
			}
			if (!letterUsed)
				break;
			else
				System.out.printf("%c is already in the word.\n", guess);


			System.out.printf("%c", guess);
			boolean guessed = false;
			for (int i = 0; i < wordCharArray.length; i++) {
				if (guess == wordCharArray[i]) {
					solvedCharArray[i] = guess;
					guessed = true;
				}
			}
			if (!guessed) {
				miss++;
				System.out.printf("\t%c is not in the word\n");
			}
			
			for (int i = 0; i < solvedCharArray.length; i++) {
				if (!(solvedCharArray[i] == wordCharArray[i]))
					break;
				if (i == solvedCharArray.length - 1) {
					System.out.printf("The word is %s. You missed %d",
						word, miss);
					return;
				}
			}
		}
	}
}
