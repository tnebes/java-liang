import java.util.Scanner;

public class DigitsInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int someInteger = 0;
		while (someInteger <= 0 || someInteger >= 1000) {
			System.out.print("Please enter a number larger than 0 and smaller than 1000: ");
			someInteger = input.nextInt();
		}
		int someIntegerOut;

		someIntegerOut = (someInteger % 10) * ((someInteger / 10) % 10) * ((someInteger / 100) % 10);


		System.out.println(someIntegerOut);
	}
}

