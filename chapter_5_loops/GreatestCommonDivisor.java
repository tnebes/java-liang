import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter first integer. ");
		int firstInteger = input.nextInt();
		System.out.print("Please enter second integer. ");
		int secondInteger = input.nextInt();

		int gcd = 1;

		for (int i = gcd + 1; firstInteger >= i && secondInteger >= i; i++) {
			// System.out.println(i);
			if (firstInteger % i == 0 && secondInteger % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("Greatest common divisor of %d and %d is %d\n",
				firstInteger, secondInteger, gcd);
	}
}
