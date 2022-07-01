/*
 * Write a method that sums t he reas of all the geometric objects in an array.
 *
 * Write a test program that creates an array of four objects (two circles and two rectangles)
 * and computes their total area using the sumArea method.
 */

package exercises.exercise_13_12;

import exercises.exercise_13_5.geometry.Circle;
import exercises.exercise_13_5.geometry.GeometricObject;
import exercises.exercise_13_7.geometry.Square;

import java.util.stream.Stream;

public class Main {

    private Main() {
        System.out.println(sumArea(new GeometricObject[]{
                Circle.generateCircle(5, "red", true),
                Circle.generateCircle(3, "blue", false),
                new Square(5),
                new Square(3)
        }));
    }

    public static double sumArea(final GeometricObject[] objects) {
        return Stream.of(objects).mapToDouble(GeometricObject::getArea).sum();
    }

    public static void main(final String[] args) {
        new Main();
    }

}
