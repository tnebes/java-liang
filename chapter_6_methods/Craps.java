public class Craps {
	public static void main(String[] args) {

		int winCounter = 0, lossCounter = 0;

		for(int i = 0; i < 1E+5; i++) {
			System.out.printf("Round %d:\n", i);
			switch(checkScore(rollDice(), rollDice())) {
				case 0:	System.out.print("\tRound won!\n");
					winCounter++;
					break;
				case 1:	System.out.print("Round lost.\n");
					lossCounter++;
					break;
				default:break;
			}
		}
		System.out.printf("You've won %d rounds and lost %d rounds.\n Balance: %d\n"
				,winCounter, lossCounter, winCounter - lossCounter);

	}

	public static int rollDice() {

		int theDice = (int) ((Math.random() * 6) + 1);
		// System.out.printf("%d\n", theDice);
		return theDice;
	
	}

	public static int checkScore(int dice1, int dice2) {
		int sum = dice1 + dice2;
		if(sum == 2 || sum == 3 || sum == 12)
			return 1;
		else if(sum == 7 || sum == 11)
			return 0;
		else
			return 2;
	}
}


