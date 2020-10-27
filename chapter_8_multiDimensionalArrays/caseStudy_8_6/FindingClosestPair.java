/* given a set of points
 * find the two points that are nearest to each other
 * An approach is to compute the distances between
 * all pairs of points and find the one with the minimum distance
 */

/* input will be from a separate file. Hardcoding the array size.
 * Input file must contains commas because of localisation and I can't
 * be bothered to change the locale.
 */

public class FindingClosestPair {
	public static void main(String[] args) {
	
		java.util.Scanner input = new java.util.Scanner(System.in);
		int numberOfPoints = 7; // hardcoded

		double[][] points = new double[numberOfPoints][2];
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = (double) input.nextDouble();
			}
		}

		int p1 = 0, p2 = 1;
		double shortestDistance = distance(
			points[p1][0], points[p1][1],
			points[p2][0], points[p2][1]);

		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(
					points[i][0], points[i][1],
					points[j][0], points[j][1]);

				if (shortestDistance > distance) {
					p1 = i;
					p2 = j;
					shortestDistance = distance;
				}
			}
		}

		System.out.printf("The closest two points are (%.1f, %.1f) and (%.1f, %.1f)\n",
			points[p1][0], points[p1][1],
			points[p2][0], points[p2][1]);

	}


	public static double distance(
		double x1, double y1, double x2, double y2) {
			return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		}
}
