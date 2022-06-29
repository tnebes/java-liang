package exercises.exercise_13_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.IntStream;

import exercises.exercise_13_2.ShuffleArrayList;

public class SortArrayList {

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        IntStream.range(0, 100).forEach(list::add);
        System.out.println("Original: " + list);
        ShuffleArrayList.MyShuffler.shuffle(list);
        System.out.println("Shuffled: " + list);
        MyArrayListSorter.sort(list);
        System.out.println("Sorted: " + list);
    }

    public static class MyArrayListSorter {

        public static void sort(ArrayList<Number> list) {
            list.sort(Comparator.comparingDouble(Number::doubleValue));
        }
    }

}