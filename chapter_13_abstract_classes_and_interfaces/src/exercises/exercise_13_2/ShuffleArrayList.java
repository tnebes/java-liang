package exercises.exercise_13_2;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ShuffleArrayList {

    public static void main(String[] args) {
        java.util.ArrayList<Number> list = new java.util.ArrayList<>();
        IntStream.range(0, 100).forEach(list::add);
        list.forEach(listElement -> System.out.print(listElement + " "));
        System.out.println();
        MyShuffler.shuffle(list);
        System.out.println(list);
    }

    public static class MyShuffler {

        public static void shuffle(ArrayList<Number> list) {
            for (int i = 0; i < list.size(); i++) {
                int randomIndex = (int) (Math.random() * list.size());
                Number temp = list.get(i);
                list.set(i, list.get(randomIndex));
                list.set(randomIndex, temp);
            }
        }

    }

}
