/*
 * Find the first 10 numbers greater than Long.MAX_VALUE that are divisible by 5 or 6
 */
import java.math.BigInteger;

public class DivisibleBy5or6 {

	public static void main(String[] args) {
		BigInteger myBigInteger = BigInteger.valueOf(Long.MAX_VALUE);
		for (int i = 0; i < 10; myBigInteger = myBigInteger.add(BigInteger.ONE)) {
			if (myBigInteger.remainder(BigInteger.valueOf(5)).equals(BigInteger.ZERO)) {
				System.out.printf("%s\n", myBigInteger.toString());
				++i;
				continue;
			}
			else if (myBigInteger.remainder(BigInteger.valueOf(6)).equals(BigInteger.ZERO)) {
				System.out.printf("%s\n", myBigInteger.toString());
				++i;
				continue;
			}
		}

	}

}
