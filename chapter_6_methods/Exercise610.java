import java.util.Scanner;

// check how many prime numbers are in a range.

public class Exercise610 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a range in which you want to check" +
			       	" how many prime numbers there are. ");
		int inputRange = Math.abs(input.nextInt());	
		System.out.printf("Number of primes in range %d is %d\n",
			       inputRange, checkPrimeInRange(inputRange));	

	}

	public static int checkPrimeInRange(int range) {
		int numberOfPrimes = 0;

		for(int i = 2; i < range; i++) {
			boolean isPrime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0)
					isPrime = false;
			}
			if(isPrime) {
				// System.out.printf("%d is prime\n", i);
				numberOfPrimes++;
			}
		}




		return numberOfPrimes;
	}
}

