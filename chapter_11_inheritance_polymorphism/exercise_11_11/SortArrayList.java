/*
 * Write a method that sorts an ArrayList of numbers
 * Write a test program that prompts the user to enter five strings and displays them in reverse order.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tnebes 22 February 2021
 */

public class SortArrayList {

    SortArrayList() {
        final int LIST_SIZE = 5;
        System.out.printf("Please enter %d integers:\n", LIST_SIZE);
        ArrayList<Integer> myList = getUserInput(5);
        System.out.println(myList.toString());
        System.out.print("Sorted list is:\n");
        sort(myList);
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

    public static void sort(ArrayList<Integer> list) {
        int temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        new SortArrayList();
    }

}
