/*
 * Find the first 10 numbers with 50 decimal digits that are divisible by 2 or 3
 */
import java.math.BigInteger;

public class DivisibleBy2or3 {

	public static void main(String[] args) {
		String myBigNumber = "1";
		final int NUMBER_OF_DIGITS = 50;
		for (int i = 0; i < NUMBER_OF_DIGITS - 1; i++) {
			myBigNumber += "0";
		}
		BigInteger myBigInteger = new BigInteger(myBigNumber);
		for (int i = 0; i < 10; myBigInteger = myBigInteger.add(BigInteger.ONE)) {
			if (myBigInteger.remainder(new BigInteger("2")).equals(BigInteger.ZERO)) {
				System.out.printf("%s\n", myBigInteger.toString());
				++i;
				continue;
			}
			else if (myBigInteger.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
				System.out.printf("%s\n", myBigInteger.toString());
				++i;
				continue;
			}
		}

	}

}
