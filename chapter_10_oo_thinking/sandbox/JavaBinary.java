/**
 * Program turns the digits of any integer
 * into their binary representation
 * @author tnebes
 *
 */

public class JavaBinary {

	public static void main(String[] args) {
		
		int randomNumber = (int) (Math.random() * 100);
		System.out.printf("%d\n", randomNumber);
		boolean[][] binary = toBinary(randomNumber);
		for (int i = binary.length - 1; i >= 0; i--) {
			for (int j = 0; j < binary[0].length; j++) {
				System.out.printf("%d", binary[i][j] == true ? 1 : 0);
			}
			System.out.print(" ");
		}
	}
	
	static boolean[][] toBinary(int number) {
		int index = 0;
		int digits = getDigits(number);
		boolean[][] binaryRepresentation = new boolean[digits][4];
		for (int i = 0; i < digits; i++) {
			binaryRepresentation[index++] = decToBinary((char) (number % 10));
			number /= 10;
		}
		return binaryRepresentation;
	}
	
	private static int getDigits(int number) {
		int counter = 0;
		while (number != 0) {
			number /= 10;
			counter++;
		}
		return counter;
	}
	
	private static boolean[] decToBinary(char number) {
		boolean[] bits = new boolean[4];
		int index = 0;
		while (index < bits.length) {
			bits[index++] = number % 2 == 1 ? true : false;
			number /= 2;
		}
		return bits;
	}

}
