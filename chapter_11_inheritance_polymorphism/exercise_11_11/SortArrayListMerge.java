/*
 * Write a method that sorts an ArrayList of numbers
 * Write a test program that prompts the user to enter five strings and displays them in reverse order.
 * NOTE: this uses bubble sort for practice.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tnebes 22 February 2021
 */

public class SortArrayListMerge {

    SortArrayListMerge() {
        final int LIST_SIZE = 5;
        System.out.printf("Please enter %d integers:\n", LIST_SIZE);
        ArrayList<Integer> myList = getUserInput(5);
        System.out.println(myList.toString());
        System.out.print("Sorted list is:\n");
        sort(myList, myList.size());
        System.out.println(myList.toString());
    }

    private ArrayList<Integer> getUserInput(int listSize) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            myList.add(input.nextInt());
        }
        return myList;
    }

    public static void sort(ArrayList<Integer> list, int size) {
        if (size < 2) {
            return;
        }
        int middleIndex = size / 2;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i = 0; i < middleIndex; i++) {
            left.add(list.get(i));
        }
        for (int i = middleIndex; i < list.size(); i++) {
            right.add(list.get(i));
        }
        sort(right, middleIndex);
        sort(left, list.size() - middleIndex);

        merge(list, left, right, middleIndex, list.size() - middleIndex);
    }

    private static void merge(
            ArrayList<Integer> list,
            ArrayList<Integer> left,
            ArrayList<Integer> right,
            int leftIndex,
            int rightIndex) {
        int i = 0, j = 0, k = 0;
        while (i < leftIndex && j < rightIndex) {
            if (left.get(i) <= right.get(j)) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        while (i < leftIndex) {
            list.set(k++, left.get(i++));
        }
        while (j < rightIndex) {
            list.set(k++, right.get(j++));
        }
    }

    public static void main(String[] args) {
        new SortArrayListMerge();
    }

}
