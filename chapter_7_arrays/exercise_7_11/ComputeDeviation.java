/* Compute the standard deviation of numbers.
 * Store the individual numbers as an array
 * The program must contain the two headers below.
 * NOTE: the name of functions have been changed.
 *
 * The individual numbers must be stored in an array.
 * Enter 10 numbers and display the mean and standard
 * deviation.
 */

public class ComputeDeviation {
	public static void main(String[] args) {

		double[] numbers = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};

		System.out.printf("Mean is %f\n Standard deviation is %f\n",
				giveMean(numbers),
				giveDeviation(numbers));
	}

	public static double giveMean(double[] x) {
		/** takes an array of doubles and returns its mean.*/
	
		double mean = 0.0d;
		for (int i = 0; i < x.length; i++) {
			mean += x[i];
		}		
		return mean / x.length;

	}

	public static double giveDeviation(double[] x) {

		/** takes an array of doubles and returns its
		 * standard deviation
		 * TODO: pass the giveMean() function
		 * as argument. Returns the standard deviation.
		 */

		// since I don't know how to use
		// functions as arguments
		// I just have to copy paste.

		double mean = 0.0d;
		for (int i = 0; i < x.length; i++) {
			mean += x[i];
		}
		mean /= x.length;

		double deviation = 0.0d;
		for (int i = 0; i < x.length; i++) {
			deviation += Math.pow(x[i] - mean, 2);
		}
		deviation = Math.sqrt(deviation / (x.length - 1));

		return deviation;
	}
}

