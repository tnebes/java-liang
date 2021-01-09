/*
 * Write a program that simulates picking a card from a deck of 52 cards.
 */

public class PickACard {

	public static void main(String[] args) {
		Deck myDeck = new Deck();
		myDeck.populateDeck();
		java.util.Random rng = new java.util.Random();
		System.out.printf("The card you picked is %s\n", myDeck.showCard(rng.nextInt(myDeck.getSize())));

	}
	

}
