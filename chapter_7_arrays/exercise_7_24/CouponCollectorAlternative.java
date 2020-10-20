/* Repeatedly pick objects from a set of objects
 * and find out how many picks are needed
 * for ALL the objects to be picked at least once.
 *
 * Problem: picking cards from a shuffled deck of 52 cards
 * and find out how many picks are needed
 * before you see one of each suit.
 *
 * how many picks are needed to get four cards from each suit
 * and display the four cards picked.
 * note: it is possible a card may be picked twice.
 *
 * note(tnebes): this is an alternate version where strings
 * are used less often.
 */

import java.util.Arrays;

public class CouponCollectorAlternative {
	public static void main(String[] args) {
	
		final String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
							"9", "10", "Jack", "Queen", "King"};
		int[][] deck = new int[suits.length * ranks.length][2];

		createDeck(deck, suits, ranks);
		shuffle(deck);
	
		int counter = 0;
		int[][] pickedCards;
		while(true) {
			pickedCards = pick(deck, 4);
			counter++;
			if (!checkDuplicate(pickedCards))
				break;
		}

		String[] normalPickedCards = getCardNames(pickedCards, suits, ranks);
		for (int i = 0; i < normalPickedCards.length; i++)
			System.out.printf("%s\n", normalPickedCards[i]);
		System.out.printf("Number of picks: %d\n", counter);
	
	}

	public static void createDeck(int[][] list,
									String[] suits,
									String[] ranks) {
		/** creates a deck of cards according to the provided cards.*/
	
		int suitsCounter = suits.length - 1;
		int ranksCounter = ranks.length - 1;

		for (int i = 0; i < list.length; i++) {
			list[i][0] = suitsCounter;
			list[i][1] = ranksCounter--;
			if (ranksCounter < 0) {
				ranksCounter = ranks.length - 1;
				suitsCounter--;			
			}		
		}

	}

	public static void shuffle(int[][] list) {
		/** shuffles a provided array */

		java.util.Random rng = new java.util.Random();
		for (int i = 0; i < list.length; i++) {
			int randomNumber = rng.nextInt(list.length);
			int[] temp = new int[2];
			temp = list[i];
			list[i] = list[randomNumber];
			list[randomNumber] = temp;
		}
	}

	public static int[][] pick(int[][] list, int number) {
		/** randomly picks a number of cards */
		
		int[][] pickedElements = new int[number][2];
		java.util.Random rng = new java.util.Random();

		for (int i = 0; i < pickedElements.length; i++) {
			int randomNumber = rng.nextInt(list.length);
			pickedElements[i][0] = list[randomNumber][0];
			pickedElements[i][1] = list[randomNumber][1];		
		}

		return pickedElements;

	}

	public static boolean checkDuplicate(int[][] list) {
		/** returns false if there are no duplicates in the array */
		for (int i = 0; i < list.length; i++) {
			for (int j = list.length - 1; j > i; j--) {
				if (list[i][0] == list[j][0])
					return true;
			}
		}

		return false;
	
	}

	public static String[] getCardNames(int[][] list,
		   String[] suits, String[] ranks) {
		/** retrieves the names of the cards for a more
		 * user friendly experience */
	
		String[] normalNames = new String[list.length];
		for (int i = 0; i < normalNames.length; i++) {
			normalNames[i] = ranks[list[i][1]] + " of " +
				suits[list[i][0]];
		}
	return normalNames;
	}

}
