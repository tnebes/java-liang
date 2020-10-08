import java.util.Arrays;

public class NumberEvenOddNumbers {
	public static void main(String[] args) {
		/* This program counts the number of odd and even
		 * numbers given as command line arguments.
		 */

		if (args.length == 0) {
			System.out.println("Usage: Java NumberEvenOddNumbers n1, n2, n3, n4 ... nn");
			System.exit(1);
		}

		int[] numberArray = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			numberArray[i] = Integer.parseInt(args[i]);
		}
		System.out.printf("%s\n\n", Arrays.toString(numberArray));

		for (int number : numberArray) {
			if (number % 2 == 1) {
				System.out.printf("%d is an odd number.\n",
					       number);
			} else {
				System.out.printf("%d is an even number.\n",
						number);
			}
		}
	}
}
