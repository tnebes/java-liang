import java.util.Scanner;

public class NewIsPrime {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		final int TESTING_RANGE = 10000;

		/* System.out.print("Input a number too see whether it is a prime number. ");
		System.out.printf("%b\n", isPrime(Math.abs(input.nextInt())));
		*/

		int numberOfPrimes = 0;
		for(int i = 2; i < TESTING_RANGE; i++) {
			if(checkIfPrime(i)) {
				numberOfPrimes++;
			}
		}

		System.out.printf("Number of primes in range %d is %d.\n", 
			TESTING_RANGE, numberOfPrimes);
	}

	public static boolean checkIfPrime(int someInt) {
	
		boolean isPrime = true;
		for(int i = 2; i < someInt; i++) {
			if(someInt % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
