/*
 * For instance, if you use nextInt() of Scanner, you could have an InputMismatchException.
 * Modify it to prevent users entering anything other than an integer.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author tnebes
 * 1 March 2021
 */
public class InputMismatchExercise {

    InputMismatchExercise() {
        String[] months = {"January", "February", "March", "April",
                "May", "June","July", "August", "September", "October",
                "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int userChoice = getUserChoice() - 1;
        try {
            System.out.printf("%s - %d", months[userChoice], dom[userChoice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("wrong number.\n");
            System.exit(1);
        }
    }

    private int getUserChoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("Input must be integer.\n");
            return getUserChoice();
        }
    }

    public static void main(String[] args) {
        new InputMismatchExercise();
    }
}
