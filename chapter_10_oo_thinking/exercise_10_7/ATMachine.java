/*
 * Use the Account class
 * Create 10 accounts with the balance of $100
 * System prompts the user to enter an id
 * Once an id is accepted, main menu is displayed
 * Once the system starts it will not stop.
 */

public class ATMachine {

	private static String[] mainMenuChoices = { "check balance", "withdraw", "deposit", "exit"};
	private final int NUMBER_OF_ACCOUNTS = 256;
	private Account[] accounts = new Account[NUMBER_OF_ACCOUNTS];
	private int accountIndex = 0;

	/**
	 * Constructor
	 */
	public ATMachine() {
		// empty constructor
	}

	/**
	 * Adds an account to the ATM machine. If the maximum number of accounts is reached, the ATM will overflow.
	 * @param account
	 */
	public void load(Account account) {
		accounts[accountIndex++] = account;
		if (accountIndex == accounts.length)
			accountIndex = 0;
	}

	/**
	 * Unloads an account from the machine.
	 * @param account
	 */
	public void unload(Account account) {
		unload(account.getId());
	}

	/**
	 * Unloads an account with the given ID. After unloading, it sorts the accounts according to their ID.
	 * @param id
	 */
	public void unload(int id) {
		for (int i = 0; i < accounts.length; i++) {
			if (!accounts[i].isActive())
				continue;
			else if (id == accounts[i].getId()) {
				accounts[i] = new Account();
				break;
			}
		}
		if (accountIndex != 0)
			accountIndex--;
		this.sort();
	}

	/**
	 * Sorts the accounts according to their ID
	 */
	private void sort() {
		Account temp;
		for (int i = 0; i < accounts.length; i++) {
			for (int j = accounts.length - 1; j > i; j++) {
				if (!accounts[j].isActive())
					continue;
				else {
					if (accounts[i].getId() > accounts[j].getId()) {
						temp = accounts[i];
						accounts[i] = accounts[j];
						accounts[j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < accounts.length; i++) {
			System.out.printf("%d ", accounts[i].getId());
		}
	}

	/**
	 * Returns the number of currently loaded active accounts
	 * @return int
	 */
	public int getNumOfLoadedAccounts() {
		int loadedAccounts = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].isActive())
				loadedAccounts++;
		}
		return loadedAccounts;
	}
	
	/**
	 * Returns the account with a given id. If no account is found, returns an inactive account.
	 * TODO: make it not bad
	 * @param id
	 * @return account
	 */
	private Account getAccount(int id) {
		Account loadedAccount = new Account();
		for (int i = 0; accounts[i].isActive() && i < accounts.length; i++) {
			if (id == accounts[i].getId()) {
				loadedAccount = accounts[i];
				break;
			}
		}
		return loadedAccount;
		
	}
	
	/**
	 * Prints the main menu
	 */
	private void showMenu() {
		System.out.print("\n");
		for(int i = 0; i < mainMenuChoices.length; i++) {
			System.out.printf("%d: %s\n", i + 1, mainMenuChoices[i]);
		}
	}
	
	/**
	 * Gets user input. Returns true if the main should be triggered with the currently active account. False if the user chose to exit.
	 * @param input
	 * @param loadedAccount
	 * @return boolean
	 */
	private boolean getMainMenuChoice(java.util.Scanner input, Account loadedAccount) {
		System.out.print("Enter a choice: ");
		int choice = input.nextInt();
		switch (choice) {
			case 1: {
				checkBalance(loadedAccount);
				return true;
			}
			case 2: {
				if(!withdraw(input, loadedAccount)) {
					return getMainMenuChoice(input, loadedAccount);
				} else {
					return true;					
				}
			}
			case 3: {
				deposit(input, loadedAccount);
				return true;
			}
			case 4: {
				showMenu();
				return false;
			}
//			case 5: {
//				debug();
//				break;
//			}
			default: {
				System.out.print("Invalid choice.\n");
				return true;
			}
		}
	}
	
	/**
	 * Prints the account's balance
	 * @param loadedAccount
	 */
	private void checkBalance(Account loadedAccount) {
		System.out.printf("The balance is %.2f\n", loadedAccount.getBalance());
	}
	
	/**
	 * Withdraws an amount from the account. If the amount to be withdrawn is larger than the 
	 * account's amount, print balance and return user to main menu
	 * @param input
	 * @param loadedAccount
	 * @return
	 */
	private boolean withdraw(java.util.Scanner input, Account loadedAccount) {
		System.out.print("Enter an amount to withdraw: ");
		double amount = input.nextDouble();
		if (amount > loadedAccount.getBalance()) {
			System.out.print("Insufficient funds.\n");
			checkBalance(loadedAccount);
			return false;
		} else {
			loadedAccount.withdraw(amount);
			return true;			
		}
	}
	
	/**
	 * Triggers a menu where the user deposits a given amount to the account
	 * @param input
	 * @param loadedAccount
	 */
	private void deposit(java.util.Scanner input, Account loadedAccount) {
		System.out.print("Enter an amount to deposit: ");
		loadedAccount.deposit(input.nextDouble());
	}
	
	/**
	 * Starts the machine. The machine never stops.
	 */
	public void run() {
		Account loadedAccount;
		while(true) {
			java.util.Scanner input = new java.util.Scanner(System.in);
			do {
				System.out.print("enter id: ");
				loadedAccount = getAccount(input.nextInt());
			} while(!loadedAccount.isActive());
			do {
				showMenu();
			} while (getMainMenuChoice(input, loadedAccount));
		}
	}

}
