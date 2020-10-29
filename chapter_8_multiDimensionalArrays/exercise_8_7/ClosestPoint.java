/* Revise the program from 8.3. so that it finds two points
 * //but we won't revise it.
 * in a three-dimensional space nearest to each other.
 * Use a 2d array to represent the points
 * The the program using the points in main.
 */

public class ClosestPoint {
	public static void main(String[] args) {
		double[][] points = {
			{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
			{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3},
			{-1.5, 4, 2}, {5.5, 4, -0.5}};

		double[][] distance = calculateDistance(points);
		printDistanceTable(distance);
		double[] smallestDistance = findSmallestDistance(distance);
		System.out.printf(
			"Smallest distance is %f between points %d and %d\n",
				smallestDistance[0],
			   	(int) smallestDistance[1],
			   	(int) smallestDistance[2]);
	}

	/** calculates the distance between the points in points
	 * returns the distance between the individual points
	 * in an array.*/
	public static double[][] calculateDistance(double[][] points) {
		double[][] distance = new double[points.length][points.length];
		double sum = 0;

		for (int i = 0; i < distance.length; i++) {
			for (int j = 0; j < distance[i].length; j++) {
				if (i == j) {
					distance[i][j] = 0;
					continue;
				}
				else {
					for (int k = 0; k < points[i].length; k++) {
						sum += Math.pow(points[j][k] - points[i][k], 2);
					}
				distance[i][j] = Math.sqrt(sum);
				sum = 0;
				}
			}
		}
		return distance;
	}

	/** returns the smallest distance as [0], and the points [1] & [2] */
	public static double[] findSmallestDistance(double[][] distanceArray) {
		// because of bad coding practices first we actually have to collect any value other than 0.
		double[] smallestDistance = getFirstValid(distanceArray);
		// now we can play.

		for (int i = 0; i < distanceArray.length; i++) {
			for (int j = 0; j < distanceArray.length; j++) {
				if (distanceArray[i][j] != 0 && distanceArray[i][j] < smallestDistance[0]) {
					smallestDistance = new double[] {distanceArray[i][j], i, j};
				}
			}
		}
		return smallestDistance;
	}

	/** pointless method that shouldn't even exist if I hadn't gotten myself
	 * in this sticky situation. */
	public static double[] getFirstValid(double[][] distanceArray) {
		for (int i = 0; i < distanceArray.length; i++) {
			for (int j = 0; j < distanceArray[i].length; j++) {
				if (distanceArray[i][j] == 0) {
					continue;
				} else {
					return new double[] {distanceArray[i][j], i, j};
				}
			}
		}
		return null;	
	}

	/** prints the distances between the points with notations */
	public static void printDistanceTable(double[][] distanceArray) {
		for (int i = 0; i < distanceArray.length; i++) {
			System.out.printf("%11d ", i);
		}
		System.out.print("\n");
		for (int i = 0; i < distanceArray.length; i++) {
			System.out.printf("%d| ", i);
			for (int j = 0; j < distanceArray[i].length; j++) {
				System.out.printf("%10.6f| ", distanceArray[i][j]);
			}
			System.out.print("\n");
		}
	}

}
