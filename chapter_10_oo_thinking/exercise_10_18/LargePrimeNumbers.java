import java.math.BigInteger;

/*
 * Write a program that finds five prime numbers larger than Long.MAX_VALUE
 */

public class LargePrimeNumbers {

	public static void main(String[] args) {
		
		BigInteger myBigInteger = BigInteger.valueOf(Long.MAX_VALUE);
		final int NUMBER_OF_PRIMES = 5;
		int primeNumbers = 0;
		boolean isPrime = true;
		
		for (BigInteger i = myBigInteger; primeNumbers < NUMBER_OF_PRIMES; i = i.add(BigInteger.ONE)) {
			isPrime = true;
			for (BigInteger j = BigInteger.valueOf(2); j.compareTo(i.sqrt()) == -1 || j.compareTo(i.sqrt()) == 0; j = j.add(BigInteger.ONE)) {
				if (i.mod(j).equals(BigInteger.ZERO)) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.printf("\t\t%s\n", i.toString());
				++primeNumbers;				
			}
		}
	}

}
