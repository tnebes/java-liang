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
			"memory", "bytes", "corona virus", "quick", "brown", "fox",
			"jumped", "over", "lazy", "dog"};
		Scanner input = new Scanner(System.in);

		do {
			guess(words);
			System.out.print("Do you want to guess another word? y/n ");
		} while (Character.toLowerCase(input.next().charAt(0)) == 'y');
		System.out.print("Thank you and goodbye.");
	}

	public static void guess(String[] wordList) {
	
		java.util.Random rng = new java.util.Random();
		java.util.Scanner input = new java.util.Scanner(System.in);
		String word = wordList[rng.nextInt(wordList.length)];
		char[] wordCharArray = new char[word.length()];
		char[] usedLetters = new char[26];
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
		do {
			do {
				System.out.print("(Guess) Enter a letter in word ");
				for (int i = 0; i < solvedCharArray.length; i++)
					System.out.printf("%c", solvedCharArray[i]);
				System.out.print(" > ");
				guess = Character.toLowerCase(input.next().charAt(0));
				System.out.print("\n");
			} while (!isUniqueGuess(guess, usedLetters));

			boolean guessedOne = false;
			for (int i = 0; i < solvedCharArray.length; i++) {
				if (guess == wordCharArray[i]) {
					solvedCharArray[i] = guess;
					guessedOne = true;
				}
			}
			if (!guessedOne) {
				miss++;
				System.out.printf("\t%c is not in the word\n", guess);
			}

		} while (!isGuessed(wordCharArray, solvedCharArray));

		System.out.printf("The word is %s. ", word);
		if (miss > 1)
			System.out.printf("You missed %d times.\n", miss);
		else
			System.out.printf("You missed %d time.\n", miss);
	}

	public static boolean isGuessed(char[] list1, char[] list2) {
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i])
				return false;
		}
		return true;
	}

	public static boolean isUniqueGuess(char guess, char[] list) {
		for (int i = 0; i < list.length; i++) {
			if (guess == list[i]) {
				System.out.printf("\t%c is already in the word\n", guess);
				return false;
			}
		}
		for (int i = 0; i < list.length; i++) {
			if (list[i] == (char) 0) {
				list[i] = guess;
				return true;
			}
		}
		return true;
	}

}
