import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex number: ");
		String hex = input.nextLine().toUpperCase();

		System.out.printf("The decimal value for hex number %s is %s\n", hex, hexToDecimal(hex));
	}

	public static int hexToDecimal(String hex) {
		int decimalValue = 0;

		for (char ch : hex.toCharArray()) {
			decimalValue = decimalValue * 16 + hexCharToDecimal(ch);
		}
		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}
}
