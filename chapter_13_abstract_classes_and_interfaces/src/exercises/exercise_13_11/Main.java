/*
 * Exercise 13.11 Octagon Class
 *
 * Write a class Octagon that extends GeometricObject
 * and implements Comparable and Cloneable interfaces.
 *
 * Assume all lenghts are of equal length.
 *
 * The class has a private double data field named side with its getter and setter methods.
 * The class has a no-arg constructor that creates an Octagon with side 0.
 * The class has a constructor that creates an Octagon with a specified side.
 *
 * Write a test program that creates an Octagon with side 5 and displays its area and perimeter.
 * Create a new object using the clone method and compare the two objects using the compareTo method.
 */

package exercises.exercise_13_11;

import exercises.exercise_13_11.geometry.Octagon;

import java.util.stream.Stream;

public class Main {

    private Main() {
        final Octagon octagon1 = Octagon.getOctagon(5, "red", true);
        octagon1.getDescription();
        final Octagon octagon2 = octagon1.clone();
        Stream.of(octagon1, octagon2).forEach(octagon -> System.out.println(octagon.getDescription()));
        System.out.printf("Octagon1 and Octagon2 are %s.\n", octagon1.compareTo(octagon2) == 0 ? "equal" : "not equal");
    }

    public static void main(final String[] args) {
        new Main();
    }

}