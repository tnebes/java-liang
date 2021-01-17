/*
 * Find the first 10 square numbers that are greater than Long.MAX_VALUE
 */

import java.math.BigInteger;

public class SquareNumbers {

	public static void main(String[] args) {

		BigInteger myBigInteger = BigInteger.valueOf(Long.MAX_VALUE);
		
		// this has to be the slowest algorithm I have ever written.
		for (int i = 0; i < 5; myBigInteger = myBigInteger.add(BigInteger.ONE)) {
			if (myBigInteger.sqrtAndRemainder()[1].equals(BigInteger.ZERO)) {
				System.out.printf("%s\n", myBigInteger.toString());
				++i;
			}
		}
		
	}

}
