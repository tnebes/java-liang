/* Write a method that returns a
 * random number from a list of numbers
 * passed in the argument.
 */

public class RandomNumberSelector {
	public static void main(String[] args) {

	int random0, random1, random2, random3;

	random0 = 54;
	random1 = 32;
	random2 = 37;
	random3 = 1;

	System.out.printf("The random number is: %d\n",
			getRandom(random0, random1, random2, random3));

	}

	public static int getRandom(int... numbers) {
		/** takes any number of arguments and "randomly"
		 * returns one int number.
		 */
	
		java.util.Random RNG = new java.util.Random();
		int randomIndex = RNG.nextInt(numbers.length);

		return numbers[randomIndex];
	}
}
