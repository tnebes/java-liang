package exercises.exercise_13_4;

/*
 * Write a PrintCalendar class to display a calendar for a specified month using
 * Calendar and GregorianCalendar classes.
 * Program receives the months and year from the command line.
 *
 * You can also run the program without the year and month arguments.
 * If year or month are not specified, the current year or month are used.
 */

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        final PrintCalendar printCalendar;
        if (args.length == 1) {
            printCalendar = new PrintCalendar(Integer.parseInt(args[0]), Calendar.getInstance().get(Calendar.YEAR));
        } else if (args.length == 2) {
            printCalendar = new PrintCalendar(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        } else {
            printCalendar = new PrintCalendar(Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
        }
        printCalendar.print();
    }

}