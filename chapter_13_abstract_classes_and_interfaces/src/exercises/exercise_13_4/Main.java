package exercises.exercise_13_4;

import java.util.Arrays;

/**
 * Write a PrintCalendar class to display a calendar for a specified month using
 * Calendar and GregorianCalendar classes.
 * Program receives the months and year from the command line.
 */

public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            args = new String[]{"10", "2016"};
//            System.out.println("Usage: java Main <month> <year>");
//            System.exit(1);
        }
        PrintCalendar calendarPrinter = new PrintCalendar(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        calendarPrinter.print();
    }

}