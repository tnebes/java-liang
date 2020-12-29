
public class CentralCity {

	/*
	 * Write a program that prompts the user to enter the number of cities and the
	 * locations of the cities and finds the central city and the total distance to
	 * all other cities.
	 * 
	 * Central city is the city that has the shortest total distance to all other
	 * cities.
	 */

	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		double[][] coordinates = setCities();
		System.out.printf("The central city is as (%f, %f)\nThe total distance to all other cities is %f",
				findCentralCity(coordinates)[0],
				findCentralCity(coordinates)[1],
				findCentralCity(coordinates)[2]);
	}

	public static double[] findCentralCity(double[][] cityCoordinates) {
		double minDistanceSum = Double.MAX_VALUE, distanceSum = 0;
		int centralCityIndex = 0;
		for (int i = 0; i < cityCoordinates.length; i++) {
			for (int j = cityCoordinates.length - 1; j > i; j--) {
				distanceSum += getDistance(cityCoordinates[i], cityCoordinates[j]);
			}
			if (distanceSum < minDistanceSum) {
				minDistanceSum = distanceSum;
				centralCityIndex = i;
			}
		}
		return new double[] { cityCoordinates[centralCityIndex][0],
				cityCoordinates[centralCityIndex][1],
				minDistanceSum };
	}

	public static double[][] setCities() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the number of cities: ");
		double[][] cities = new double[input.nextInt()][2];
		for (int i = 0; i < cities.length; i++) {
			System.out.printf("Enter the coordinates of city %d: ", i + 1);
			cities[i][0] = input.nextDouble();
			cities[i][1] = input.nextDouble();
		}
		input.close();
		return cities;
	}

	public static double getDistance(double[] city1, double[] city2) {
		return Math.sqrt(Math.pow((city2[0] - city1[0]), 2) + Math.pow((city2[1] - city1[1]), 2));
	}

}
