import java.util.Scanner;

public class HexDigit2Dec {
	public static void main(String[] args) {
		// converting hex into decimal.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a single hex digit:");
		// why not char?
		// answer: Had I used char here an exception would occur
		// if the user entered more than one character. I would
		// have had to use try/except.
		String hexString = input.nextLine();

		//check if it's a single digit.
		
		if (hexString.length() != 1) {
			System.out.println("You must enter exactly one character");
			// I could have implemented a do/while here so that the
			// program continues running until correct input.
			System.exit(1);
		}

		char ch = Character.toUpperCase(hexString.charAt(0));
		
		if ('A' <= ch && ch <= 'F') {
			int value = ch - 'A' + 10;
			// why 'A' + 10? So that I don't have to guess
			// the int value of 'A'. Java knows but I don't need
			// to.
			System.out.println("The decimal value for hex digit " +
					ch + " is " + value);
		}
		else if (Character.isDigit(ch)) {
			System.out.printf("The decimal value for hex digit %c is %c\n", ch, ch);
			// no reason to do any magic here. If it's a digit
			// it's a digit.
		}
		else {
			System.out.printf("%c is an invalid input\n", ch);
		}
	}
}
