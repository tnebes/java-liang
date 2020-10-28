/* each line of the file Weather.txt consists of four numbers
 * that indicate
 * the day, hour, temperature, humidity
 *
 * Write a program that calculates
 * the average temperature and humidity for the 10 days.
 *
 * data[day][hour][temperature or humidity] // why or though?
 */

import java.util.Scanner;
import java.util.Locale;

public class Weather {
	public static void main(String[] args) {
		// hardcoded values for retrieving data from the .txt file.
		final int NUMBER_OF_DAYS = 10;
		final int NUMBER_OF_HOURS = 24;
		double[][][] data
			= new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);
		// a single for loop that loops through all the data in the .txt
		// file.
		for (int i = 0; i < NUMBER_OF_DAYS * NUMBER_OF_HOURS; i++) {
			int day = input.nextInt();
			int hour = input.nextInt();
			double temperature = input.nextDouble();
			double humidity = input.nextDouble();
			data[day - 1][hour - 1][0] = temperature;
			data[day - 1][hour - 1][1] = humidity;
		}

		for (int i = 0; i < NUMBER_OF_DAYS; i++) {
			double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
			for (int j = 0; j < NUMBER_OF_HOURS; j++) {
				dailyTemperatureTotal += data[i][j][0];
				dailyHumidityTotal += data[i][j][1];
			}
			
			System.out.printf("Day %d's average temperature is %.2f\n",
					i, dailyTemperatureTotal / NUMBER_OF_HOURS);
			System.out.printf("Day %d's average humidity is %.2f\n",
					i, dailyHumidityTotal / NUMBER_OF_HOURS);

		}
	}
}
