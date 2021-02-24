/*
 * Write a method that removes the duplicate elements from an array list of integers.
 * Write a test program that prompts the user to enter 10 integers to a list
 * and displays the distinct integers in their input order and separated by exactly
 * one space.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tnebes
 */

public class RemoveDuplicates {

    RemoveDuplicates() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        final int NUMBER_OF_NUMBERS = 10;

        System.out.printf("Please enter %d integers:\n", NUMBER_OF_NUMBERS);
        for (int i = 0; i < NUMBER_OF_NUMBERS; i++) {
            list.add(input.nextInt());
        }
        removeDuplicate(list);
        System.out.print("The distinct integers are: ");
        for (Integer myInteger : list) {
            System.out.print(myInteger + " ");
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        new RemoveDuplicates();
    }

}
