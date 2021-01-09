/*
 * Write a program that displays the current year, month and day in
 * GregorianCalendar
 * Use the method of the class setTimeInMillis(long) and display the year, month and day for 1234567898765L
 */

import java.util.GregorianCalendar;
public class UseGregorianCalendar {

	public static void main(String[] args) {
		GregorianCalendar date = new GregorianCalendar();
		int[] YearMonthDay = getYMD(date);
		// January is the 0th month
		for (int i = 0; i < YearMonthDay.length; i++) {
			System.out.printf("%d ", YearMonthDay[i]);
		}
		System.out.print("\n");
		date.setTimeInMillis(1234567898765L);
		YearMonthDay = getYMD(date);
		for (int i = 0; i < YearMonthDay.length; i++) {
			System.out.printf("%d ", YearMonthDay[i]);
		}


	}
	
	public static int[] getYMD(GregorianCalendar date) {
		return new int[] {date.get(GregorianCalendar.YEAR), date.get(GregorianCalendar.MONTH), date.get(GregorianCalendar.DAY_OF_MONTH)};
	}

}
