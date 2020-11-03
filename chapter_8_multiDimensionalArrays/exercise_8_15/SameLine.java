/* Exercise 6.29 gives a method for testing
 * whether three points are on the same line.
 *
 * Write a method to test whether all the points in the array
 * are on the same line.
 * Write a program that prompts the user to
 * enter five points and displays whether they are on the same line.
 */

import java.util.Locale;

public class SameLine {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		final int NUMBER_OF_POINTS = 5;
		double[][] points = new double[NUMBER_OF_POINTS][2];
		System.out.printf("Enter %d points: ", points.length);
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		System.out.printf("%s", sameLine(points) ?
			"The points are on the same line\n" :
			"The points are not on the same line\n");
	}

	/** returns true if all the points in the 2d array are on the same line*/
	public static boolean sameLine(double[][] points) {
		final double EPSILON = 1E-14;
		for (int i = 2; i < points.length; i++) {
			if (Math.abs(
					((points[i][1] - points[0][1]) 
					/ (points[1][1] - points[0][1]))
				    - ((points[i][0] - points[0][0])
					/ (points[1][0] - points[0][0]))) < EPSILON) {
					continue;
				} else {
					return false;
				}
		}
		return true;
	}

}
