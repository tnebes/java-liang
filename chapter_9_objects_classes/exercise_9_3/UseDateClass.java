/*
 * Write a program that creates a Date object.
 * Set the elapsed time to
 * 	10000, 100000, 1000000, 100000000, 100000000, 1000000000, 10000000000, and 100000000000.
 * and displays the date and time using toString().
 */

import java.util.Date;

public class UseDateClass {

	public static void main(String[] args) {
		long[] elapsedTime = { 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L };
		Date[] dates = new Date[elapsedTime.length];

		for (int i = 0; i < dates.length; i++) {
			dates[i] = new Date(elapsedTime[i]);
			System.out.printf("%-12d = %s\n", elapsedTime[i], dates[i].toString());
		}
	}

}
