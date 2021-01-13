/*
 * Write a program that displays all the prime umbers less than 120 in decreasing order.
 * Use the StackOfIntegers class to store the prime numbers and retrieve and display
 * them in reverse order.
 */
public class DisplayPrimeNumbers {

	public static void main(String[] args) {

		final int MAX = 120;
		StackOfIntegers stack = getPrimeNumbers(MAX);
		long time = System.nanoTime();
		while(!stack.empty()) {
			System.out.printf("%d ", stack.pop());
		}
		System.out.printf("\n%d\n", System.nanoTime() - time);
	}

	static StackOfIntegers getPrimeNumbers(int number) {

		int squaredNumber = (int) Math.sqrt(number);
		StackOfIntegers stack = new StackOfIntegers((int) squaredNumber + 1);
		// uses sieve of Eratosthenes

		boolean[] primes = new boolean[number + 1];
		for (int i = 2; i < number; i++) {
			for (int j = 2; j <= number / i; j++) {
				//if is useful for larger MAX values
				if (!primes[i * j])
					primes[i * j] = true; 
			}
		}

		
		for (int i = 2; i < primes.length; i++) {
			if (!primes[i]) {
				stack.push(i);
			}
		}
		
		return stack;
	}

}
