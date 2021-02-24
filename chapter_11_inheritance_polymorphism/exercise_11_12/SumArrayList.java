/*
 * Write a test program that prompts the user to enter five numbers,
 * stores them in an array list, and displays their sum.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tnebes, 24 February 2021
 */

public class SumArrayList {

    SumArrayList() {
        final int NUMBER_OF_NUMBERS = 5;
        ArrayList<Double> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter %d numbers:\n", NUMBER_OF_NUMBERS);
        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            list.add(input.nextDouble());
        }
        System.out.printf("Sum of numbers is %f.\n", sum(list));
    }

    public static void main(String[] args) {
        new SumArrayList();
    }

    public static Double sum(ArrayList<Double> list) {
        if (list.size() == 0) {
            return null;
        }
        Double sum = 0.0;
        for (Double myDouble : list) {
            sum += myDouble;
        }
        return sum;
    }

}
