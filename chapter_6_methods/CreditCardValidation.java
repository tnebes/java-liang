import java.util.Scanner;

public class CreditCardValidation {
	public static void main(String[] args) {

		// Scanner input = new Scanner(System.in);
		long creditCardNumber = 4388576018410707L;
		System.out.print(isValid(creditCardNumber));
		creditCardNumber = 4388576018402626L;
		System.out.print(isValid(creditCardNumber));


	}

	public static boolean isValid(long number) {

		return (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;

	}

	public static int sumOfDoubleEvenPlace(long number) {
		long myNumber = number;
		int sumOfNumbers = 0;

		while(myNumber != 0) {
			long tempNumber;
			myNumber /= 10;
			tempNumber = ((myNumber % 10) * 2);
			if(tempNumber > 9) {
				tempNumber = (tempNumber / 10) + (tempNumber % 10);
			}
			myNumber /= 10;
			sumOfNumbers += tempNumber;
			
		}
		return sumOfNumbers;
	}

	public static int sumOfOddPlace(long number) {
		long myNumber = number;
		int sumOfNumbers = 0;

		while(myNumber != 0) {
			sumOfNumbers += myNumber % 10;
			myNumber /= 100;
		}
		return sumOfNumbers;
	}

}
