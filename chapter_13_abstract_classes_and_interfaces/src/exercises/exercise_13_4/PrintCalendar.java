package exercises.exercise_13_4;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.stream.IntStream;

public class PrintCalendar {

    private static final int CALENDAR_WIDTH = 29;
    private static final String[] DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private static final String[] MONTHS_OF_THE_YEAR = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private final Calendar calendar;

    public PrintCalendar(final int month, final int year) {
        this.calendar = GregorianCalendar.getInstance();
        this.calendar.set(Calendar.MONTH, month - 1);
        this.calendar.set(Calendar.YEAR, year);
    }

    private static void printCalendarHeader(final int month, final int year) {
        final String header = MONTHS_OF_THE_YEAR[month] + " " + year;
        PrintCalendar.printMiddle(header);
        PrintCalendar.printDashes();
    }

    private static void printCalendarBody(final Calendar calendar) {
        PrintCalendar.printNamesDaysOfTheMonth();
        PrintCalendar.printDays(calendar);
    }

    private static void printDays(final Calendar calendar) {
        IntStream.range(0, calendar.get(Calendar.DAY_OF_WEEK) + 1).forEach(i -> {
            System.out.printf("%4s", "");
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        });

    }

    private static void printNamesDaysOfTheMonth() {
        Arrays.stream(DAYS_OF_THE_WEEK).forEach(day -> System.out.printf("%4s", day));
        System.out.println();
    }

    private static void printDashes() {
        IntStream.range(0, CALENDAR_WIDTH).forEach(i -> System.out.print("-"));
        System.out.println();
    }

    private static void printMiddle(final String string) {
        final int stringLength = string.length();
        final int leftPadding = (PrintCalendar.CALENDAR_WIDTH - stringLength) / 2;
        final int rightPadding = PrintCalendar.CALENDAR_WIDTH - stringLength - leftPadding;
        System.out.printf("%" + leftPadding + "s", "");
        System.out.print(string);
        System.out.printf("%" + rightPadding + "s\n", "");
    }

    public void print() {
        System.out.println();
        printCalendarHeader(this.calendar.get(Calendar.MONTH), this.calendar.get(Calendar.YEAR));
        printCalendarBody(this.calendar);
        System.out.println();
    }

}
