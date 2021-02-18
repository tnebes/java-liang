/*
 * Write the following method that shuffles the elements in an ArrayList of integers
 */

import java.util.ArrayList;
import java.util.Random;

/**
 * @author tnebes 18 February 2021
 */

public class ArrayListShuffle {

    ArrayListShuffle() {
        ArrayList<Integer> myList = new ArrayList<>();
        populateList(myList);
        printList(myList);
        shuffle(myList);
        printList(myList);
    }

    private void populateList(ArrayList<Integer> myList) {
        final int ELEMENTS_TO_ADD = 25;
        for (int i = 0; i <= ELEMENTS_TO_ADD; i++) {
            myList.add(i);
        }
    }

    private void printList(ArrayList<Integer> myList) {
        for (Integer integer : myList) {
            System.out.printf("%d ", integer);
        }
        System.out.print("\n");
    }

    public static void shuffle(ArrayList<Integer> list) {
        Integer temp;
        int randomIndex;
        Random rng = new Random();
        for (int i = 0; i < list.size(); i++) {
            randomIndex = rng.nextInt(list.size());
            temp = list.get(randomIndex);
            list.set(randomIndex, list.get(i));
            list.set(i, temp);
        }
    }

    public static void main(String[] args) {
        new ArrayListShuffle();
    }

}
