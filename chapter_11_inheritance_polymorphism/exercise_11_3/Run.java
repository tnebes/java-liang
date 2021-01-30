
public class Run {

	Run() {
		Account accounts[] = new Account[3];
		accounts[0] = new Account(484, 1337);
		accounts[1] = new SavingsAccount(774, 23.5);
		accounts[2] = new CheckingAccount(44, -74.3, 500);
		
		for (int i = 0; i < accounts.length; i++) {
			System.out.printf("%s\n\n", accounts[i].toString());
		}
	}
	
	public static void main(String[] args) {
		new Run();

	}

}
