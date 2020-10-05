import java.util.Scanner;

public class GeneratingRandomCharacters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int MAXIMUM_UNICODE = 65535;
		int randomInt = 0;
		char randomChar;

		while(true) {
			
			System.out.print("Enter an integer to 65535 to get a random character: ");
			randomInt = getRandomInt(input, MAXIMUM_UNICODE);
			int trulyRandomInt = (int) (Math.random() * randomInt);
			randomChar = (char) trulyRandomInt;
			System.out.printf("Random number %d gives: %c \t\n",
					trulyRandomInt, randomChar);

			System.out.print("Continue? Y/N\t");
			if (input.next().toUpperCase().equals("N"))
				break;
		}
	}
	public static int getRandomInt(Scanner input, int MAXIMUM_UNICODE) {
		int randomRange = Math.abs(input.nextInt());
		if (randomRange > MAXIMUM_UNICODE)
			randomRange = MAXIMUM_UNICODE;
		return randomRange;
	}
}
