/*
 * Write a program that prompts the user
 * to enter an integer between 1 and 12
 * and then displays the months and its number of days
 * corresponding to the integer entered.
 * Your program should display "wrong number" if
 * the user enters a wrong number by catching
 * ArrayIndexOutOfBoundsException.
 */

import java.util.Scanner;

/**
 * @author tnebes
 * 1 March 2021
 */
public class ArrayIndexExceptionExercise {

    ArrayIndexExceptionExercise() {
        String[] months = {"January", "February", "March", "April",
                "May", "June","July", "August", "September", "October",
                "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter month number: ");
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt() - 1;
        try {
            System.out.printf("%s - %d", months[userChoice], dom[userChoice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("wrong number.\n");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        new ArrayIndexExceptionExercise();
    }
}
