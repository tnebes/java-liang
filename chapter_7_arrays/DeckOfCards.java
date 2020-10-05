public class DeckOfCards {
	public static void main(String[] args) {
		
		final int NUMBER_OF_CARDS = 52;
		int[] deck = new int[NUMBER_OF_CARDS]; // create an empty deck
		final String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "Jack", "Queen", "King"};

		for (int i = 0; i < deck.length; i++) {
			deck[i] = i; // give each card a unique identity in the form of an integer
		}

		// shuffling the deck
		
		for (int i = 0; i < deck.length; i++) {
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}

		// here comes the fun part.
		// there are 4 suits in the deck
		// and 13 ranks.
		// By dividing the unique number with 13, you get 4 suits.
		// By moduling the unique number with 13, you get the 13 ranks.
		// Therefore: By diving and moduling a number you can get its suit and rank.
		
		java.util.Scanner input = new java.util.Scanner(System.in);

		int numberOfCardsDisplay = 0;
		do {
			System.out.print("How many cards would you like to display? ");
			numberOfCardsDisplay = input.nextInt();
		
		} while (numberOfCardsDisplay < 0 || numberOfCardsDisplay > NUMBER_OF_CARDS);

		for (int i = 0; i < numberOfCardsDisplay; i++) {
			String suit = suits[deck[i] / 13]; // get the index of a suit of the deck of i divided by 13
			String rank = ranks[deck[i] % 13]; // get the index of a rank that is the modulo 13
			System.out.printf("Card number %d: %s of %s.\n", deck[i], rank, suit);
		}
	}
}
