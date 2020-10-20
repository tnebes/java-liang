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
 */

import java.util.Arrays; // remove this

public class CouponCollector {
	public static void main(String[] args) {

	// the cards
	final String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
							"9", "10", "Jack", "Queen", "King"};
	String[] deck = new String[52];	
	
	//creating the deck
	for (int i = 0; i < deck.length; i++) {
		for (int suit = 0; suit < suits.length; suit++) {
			for (int rank = 0; rank < ranks.length; rank++, i++) {
				deck[i] = ranks[rank] + " of " + suits[suit];
			}
		}
	}

	shuffle(deck);

	//checking whether all 4 suits are present in the draw
	int counter = 0;
	String[] pickedCards;
	boolean containsDuplicate;
	while(true) {
		pickedCards = pick(deck);
		counter++;

		String[] pickedSuits = new String[4];
		//going through the draw
		for (int i = 0; i < pickedCards.length; i++) {
			String pickedSuit = pickedCards[i];
			//extracting suit
			for (int j = 0; j < suits.length; j++) {
				if (pickedSuit.contains(suits[j])) {
					pickedSuit = pickedSuit.substring(
							pickedSuit.indexOf(suits[j]));
					pickedSuits[i] = pickedSuit;
					break;
				}
			}
		}

		//checking duplicates
		containsDuplicate = false;
		for (int i = 0; i < pickedSuits.length && !containsDuplicate; i++) {
			for (int j = pickedSuits.length - 1; j > i; j--) {
				if (pickedSuits[i].equals(pickedSuits[j])) {
					containsDuplicate = true;
					break;
				}
			}
		}
		if (!containsDuplicate)
			break;
	}

	System.out.printf("A draw with all suits has been found in %d picks.\n",
		counter);
	for (int i = 0; i < pickedCards.length; i++)
		System.out.printf("%s\n", pickedCards[i]);
	}

	public static void shuffle(String[] list) {
		/** shuffles the deck.*/

		String temp;
		java.util.Random rng = new java.util.Random();

		for (int i = 0; i < list.length; i++) {
			int random = rng.nextInt(list.length);
			temp = list[i];
			list[i] = list[random];
			list[random] = temp;
		}
	}

	public static String[] pick(String[] list) {
		/** Picks 4 random items from a list and returns them.*/

		java.util.Random rng = new java.util.Random();
		String[] pickedItems = new String[4];

		for (int i = 0; i < pickedItems.length; i++) {
			int randomNumber = rng.nextInt(list.length);
			pickedItems[i] = list[randomNumber];
		}
		return pickedItems;
	
	}

}
