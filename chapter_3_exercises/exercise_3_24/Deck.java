public class Deck {

	private Card[] deck;
	private final int MAX_RANK = 13;
	private final int MAX_SUIT = 4;
	
	public Deck() {
		this(52);
	}
	
	public Deck(int size) {
		this.deck = new Card[size];
		// cards with rank and suit < 0 are considered to be empty.
		// Initialise an empty deck of 52 cards.
		for (int i = 0; i < deck.length; i++)
			this.deck[i] = new Card(-1, -1);
	}
	
	/**
	 * Method returns the card at a given position
	 * @param position
	 * @return String
	 */
	public String showCard(int position) {
		return deck[position].getCard();
	}
	
	/**
	 * Method returns the value of a card, rank is 0, suit is 1
	 * @param position
	 * @return
	 */
	public int[] showCardValue(int position) {
		return new int[] {deck[position].getRank(), deck[position].getSuit()};
	}
	
	/**
	 * Randomly fills out a deck. May contain duplicates
	 */
	public void populateDeckRandomly() {
		for (int i = 0; i < deck.length; i++) {
			this.deck[i] = new Card();
		}
	}
	
	/**
	 * Populates the deck uniformly until the deck is either filled out or there
	 * are no more cards.
	 */
	public void populateDeck() {
		int card = 0;
		for (int i = 0; i < MAX_SUIT; i++) {
			for (int j = 0; j < MAX_RANK; j++) {
				deck[card++] = new Card(j, i);
				if (card >= deck.length);
					break;
			}
		}
	}
	
	/**
	 * Returns the size of the deck.
	 * @return
	 */
	public int getSize() {
		return deck.length;
	}
}
