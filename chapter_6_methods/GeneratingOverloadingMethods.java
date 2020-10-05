import java.util.Scanner;

public class GeneratingOverloadingMethods {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.print("Enter two chars " +
					"or enter two ints " +
					"to get a random character.\n> ");
			char randomChar;
			String myInputString = input.nextLine();
			String userInput1 = myInputString.substring(0, myInputString.indexOf(' '));
			String userInput2 = myInputString.substring(myInputString.indexOf(' ') + 1);

			randomChar = getRandomCharacter(userInput1, userInput2);

			System.out.printf("Chosen random char is %c\n", randomChar);
			System.out.print("Continue? Y/N ");
			if (input.next().toUpperCase().equals("N"))
					break;
			input.nextLine(); // java sorcery about the consumption of \n
		}
	}

	public static char getRandomCharacter(String string1, String string2) {

		char ch1, ch2;
		ch1 = string1.charAt(0);
		ch2 = string2.charAt(0);

		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	public static char getRandomCharacter(int int1, int int2) {

		return (char) (int1 + Math.random() * (int2 - int1 + 1));
	}
}
