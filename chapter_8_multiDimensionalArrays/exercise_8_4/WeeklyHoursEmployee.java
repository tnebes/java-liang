/* supposed the weekly hours for all employees are
 * stored in a 2d array.
 * Each row record an employee's seven day work hours with
 * seven columns.
 * 
 * Write a program that displays employees and their total hours
 * in increasing order of the total hours.
 */

public class WeeklyHoursEmployee {
	public static void main(String[] args) {
		
		final int NUMBER_OF_EMPLOYEES = 8;

		int[][] employeeHours = generateHours(NUMBER_OF_EMPLOYEES);
		int[] employeeID = new int[employeeHours.length];
		for (int i = 0; i < employeeID.length; i++) {
			employeeID[i] = i;
		}

		int[] hourSum = calculateHours(employeeHours);
		sortEmployeeHours(employeeHours, hourSum, employeeID);
		printTable(hourSum, employeeID);

	}

	/** generates daily hours for each individual worker and
	 * returns a 2d array
	 */
	public static int[][] generateHours(int numberOfEmployees) {
		java.util.Random rng = new java.util.Random();

		final int NUMBER_OF_DAYS = 7;

		int[][] employeeHours = new int[numberOfEmployees][NUMBER_OF_DAYS];
		for (int i = 0; i < employeeHours.length; i++) {
			for (int j = 0; j < employeeHours[i].length; j++) {
				employeeHours[i][j] = rng.nextInt(9);
			}
		}

		return employeeHours;

	}

	/** sorts the employees and their hours in increasing
	 *  number of hours they worked.
	 */
	public static void sortEmployeeHours(
		int[][] hours,
	   	int[] hourSum,
	   	int[] ID) {
	
		int tempSum;
		int[] tempEmployeeHours;
		int tempID;
		for (int i = 0; i < hourSum.length; i++) {
			for (int j = hourSum.length - 1; j > i; j--) {
				if (hourSum[j] < hourSum[j - 1]) {
					tempSum = hourSum[j - 1];
					hourSum[j - 1] = hourSum[j];
					hourSum[j] = tempSum;

					tempEmployeeHours = hours[j - 1];
					hours[j - 1] = hours[j];
					hours[j] = tempEmployeeHours;

					tempID = ID[j - 1];
					ID[j - 1] = ID[j];
					ID[j] = tempID;
				}
			}
		}

	}

	/** returns an int array containing all the hours that the
	 * employees did in a week
	 */
	public static int[] calculateHours(int[][] hours) {
		int sum = 0;
		int[] hourSum = new int[hours.length];

		for (int i = 0; i < hourSum.length; i++) {
			for (int j = 0; j < hours[i].length; j++) {
				sum += hours[i][j];
			}
			hourSum[i] = sum;
			sum = 0;
		}
		return hourSum;
	}

	/** prints the employees and their hours */
	public static void printTable(int[] sums, int[] IDs) {
		for (int i = 0; i < sums.length; i++) {
			System.out.printf("Employee %d weekly hours:\t %d\n",
				IDs[i], sums[i]);
		}
	}

}
