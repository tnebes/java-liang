/* Write a program that prompts the user
 * to enter an integer
 * between 1 and 12 and then
 * displays the name of the month
 * that corresponds to the integer.
 *
 * If the user enters three, the Program should
 * display March.
 */

public class MonthName {
	public static void main(String[] args) {
	
		final String[] MONTH_NAMES = {"January", "February",
			"March", "April", "May", "June", "July",
			"August", "September", "October", "November", 
			"December"};

		System.out.printf("Chosen month is %s.\n",
			MONTH_NAMES[getUserChoice()]);

	}

	public static int getUserChoice() {
	
		java.util.Scanner input = new java.util.Scanner(System.in);
		int userChoice = 0;

		while (userChoice <= 0 || userChoice > 12) {
			System.out.print("Please enter a number between 1 and 12: ");
			userChoice = input.nextInt();
		}
	
		return userChoice - 1;

	}

}
