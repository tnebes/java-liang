/*
 * Use the Account class
 * Create 10 accounts with the balance of $100
 * System prompts the user to enter an id
 * Once an id is accepted, main menu is displayed
 * Once the system starts it will not stop.
 */

public class Run {

	public static void main(String[] args) {
		final int NUMBER_OF_ACCOUNTS = 10;
		ATMachine machine = new ATMachine();
		for (int i = 0; i < NUMBER_OF_ACCOUNTS; i++) {
			machine.load(new Account(i, 100));
		}
		machine.run();

	}

}
