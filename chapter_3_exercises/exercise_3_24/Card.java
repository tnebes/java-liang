public class Card {
	
	private static java.util.Random rng = new java.util.Random();
	private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
			"9", "10", "Jack", "Queen", "King"};
	private static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	private int rank, suit;
	
	public Card() {
		this(rng.nextInt(12), rng.nextInt(4));
	}
	
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public int getSuit() {
		return this.suit;
	}
	
	public String getCard() {
		if (this.rank < 0 || this.suit < 0)
			return "empty";
		else
			return (ranks[this.rank] + " of " + suits[this.suit]);
	}
	
}
