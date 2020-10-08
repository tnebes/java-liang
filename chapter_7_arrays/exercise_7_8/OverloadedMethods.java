/* 
 * This program will return the average
 * of an array
 */

// import java.util.Scanner; // let's do something different instead of importing

public class OverloadedMethods {
	public static void main(String[] args) {

		System.out.println("Please enter 10 values with" +
				" decimal points.");
		java.util.Scanner input = new java.util.Scanner(System.in);
		double[] values = new double[10];

		for (int i = 0; i < 10; i++) {
			values[i] = input.nextDouble();
		}

		System.out.printf("The average is %.2f", average(values));


	}

	public static int average(int[] array) {
		int sum = 0;
		for (int value : array) {
			sum += value;
		}
		return sum / array.length;
	}

	public static double average(double[] array) {
		double sum = 0.0;
		for (double value : array) {
			sum += value;
		}
		return sum / array.length;
	}
}
