public class Deck {

	private Card[] deck;
	private final int MAX_RANK = 13;
	private final int MAX_SUIT = 4;
	
	public Deck() {
		this(52);
	}
	
	public Deck(int size) {
		this.deck = new Card[size];
		for (int i = 0; i < deck.length; i++)
			this.deck[i] = new Card(-1, -1);
	}
	
	public String showCard(int position) {
		return deck[position].getCard();
	}
	
	public int[] showCardValue(int position) {
		return new int[] {deck[position].getRank(), deck[position].getSuit()};
	}
	
	public void populateDeckRandomly() {
		for (int i = 0; i < deck.length; i++) {
			this.deck[i] = new Card();
		}
	}
	
	public void populateDeck() {
		int card = 0;
		for (int i = 0; i < MAX_SUIT; i++) {
			for (int j = 0; j < MAX_RANK; j++) {
				deck[card++] = new Card(j, i);
			}
		}
	}
	
	public int getSize() {
		return deck.length;
	}
}
