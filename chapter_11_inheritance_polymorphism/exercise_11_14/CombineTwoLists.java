/*
 * Write a method that returns the union of two array lists of integers.
 * Write a tet program that prompts the user to enter two lists,
 * each with five integers, and displays their union. The numbers are
 * separated by exactly one space.
 */

/**
 * @author tnebes 24 February 2021
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoLists {

    CombineTwoLists() {
        final int NUMBER_OF_INTEGERS = 5;
        ArrayList<Integer> list0 = getUserArrayList(NUMBER_OF_INTEGERS);
        ArrayList<Integer> list1 = getUserArrayList(NUMBER_OF_INTEGERS);
        ArrayList<Integer> combinedList = union(list0, list1);
        System.out.println("The combined list is: ");
        for (Integer myInteger : combinedList) {
            System.out.print(myInteger + " ");
        }
    }

    private ArrayList<Integer> getUserArrayList(int arrayListSize) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter %d integers for the list:\n", arrayListSize);
        for (int i = 0; i < arrayListSize; i++) {
            list.add(input.nextInt());
        }
        return list;
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list0, ArrayList<Integer> list1) {
        ArrayList<Integer> newList = new ArrayList<>();
        copyList(list0, newList);
        copyList(list1, newList);
        return newList;
    }

    public static void copyList(ArrayList<Integer> donorList, ArrayList<Integer> recipientList) {
        for (Integer myInteger : donorList) {
            recipientList.add(myInteger);
        }
    }

    public static void main(String[] args) {
        new CombineTwoLists();
    }
}
