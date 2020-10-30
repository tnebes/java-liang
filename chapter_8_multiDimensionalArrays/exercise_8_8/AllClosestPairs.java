/* Revise Listing 8.3 to display all closest
 * pairs of points with the same minimum distance.*/

/* Note: I rewrote exercise_8_5 so essentially I found the minimum
 * distance between two points in 3D space. */

public class AllClosestPairs {
	public static void main(String[] args) {
		double[][] points = {
			{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
			{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3},
			{-1.5, 4, 2}, {5.5, 4, -0.5}};

		double[][] distance = calculateDistance(points);
		double[][] smallestDistances = findSmallestDistances(distance);
		printSmallestDistances(smallestDistances, points);
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

	/** returns the smallest distances as [0], and the points [1] & [2] */
	public static double[][] findSmallestDistances(
		double[][] distanceArray) {
		// because of bad coding practices first we actually have to collect any value other than 0.
		double[][] smallestDistances =
			new double[(int) Math.pow(distanceArray.length, 2)][3];
		smallestDistances[0] = getFirstValid(distanceArray);
		// now we can play.
		int counter = 0;

		for (int i = 0; i < distanceArray.length; i++) {
			for (int j = 0; j < distanceArray.length; j++) {
				if (distanceArray[i][j] != 0
					&& distanceArray[i][j] <= smallestDistances[0][0]) {
						if (distanceArray[i][j] < smallestDistances[0][0]) {
							counter = 0;
							smallestDistances = new double[(int) Math.pow(distanceArray.length, 2)][3];
							smallestDistances[counter++] = new double[] {distanceArray[i][j], i, j};
						} else {
							smallestDistances[counter++] = new double[] {distanceArray[i][j], i, j};
						}
					}
				}
			}
		return smallestDistances;
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

	/** prints the smallest distances and the points */
	public static void printSmallestDistances(double[][] distances, double[][] points) {
		int[][] pointsID = new int[distances.length][2];
		for (int i = 0; i < pointsID.length; i++) {
			for (int j = 0; j < pointsID[i].length; j++) {
				pointsID[i][j] = (int) distances[i][j + 1];
			}
		}
		for (int i = 0; i < distances.length; i++) {
			if (distances[i][0] == 0) {
				break;
			} else {
				System.out.printf("The closest two points are (%.2f, %.2f, %.2f) and (%.2f, %.2f, %.2f). Distance is %.6f.\n",
					points[pointsID[i][0]][0], points[pointsID[i][0]][1], points[pointsID[i][0]][2],
					points[pointsID[i][1]][0], points[pointsID[i][1]][1], points[pointsID[i][1]][2],
					distances[i][0]);
			}
		}
	}


}
