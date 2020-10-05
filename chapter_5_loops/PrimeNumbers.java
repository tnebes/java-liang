import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter range for prime number testing: ");
		int desiredPrimeRange = Math.abs(input.nextInt());
		boolean isPrime;
		int largestDivisor = 0;

		for (int i = 2; i <= desiredPrimeRange; i++) {
			isPrime = true;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0 && i != j) {
					isPrime = false;
					//System.out.printf("\t%d is not a prime number because it is divisible by %d\n", i, j);
					if (j > largestDivisor) {
						largestDivisor = j;
					}
					break;
				}				
			}
			if (isPrime) {
			System.out.printf("%d is a prime number!\n", i);
			}
		}
		System.out.printf("%d was the largest divisor.\n", largestDivisor);
	}
}
