package exercises.exercise_13_5;

import exercises.exercise_13_5.geometry.Circle;
import exercises.exercise_13_5.geometry.GeometricObject;
import exercises.exercise_13_5.geometry.Triangle;

/**
 * Modify the GeometricObject class to implement the Comparable interface
 * Define a static max() method in GeometricObject class for finding
 * the larger of two GeometricObject classes.
 *
 * Write a test program that uses the max() method to find the larger
 * of the two circles and the larger of the two rectangles.
 */

public class Main {

    public Main() {
        final Triangle triangleLarger = Triangle.generateTriangle(3, 4, 5, "red", true);
        final Triangle triangleSmaller = Triangle.generateTriangle(2, 3, 4, "red", true);
        final Circle circleLarger = Circle.generateCircle(5, "red", false);
        final Circle circleSmaller = Circle.generateCircle(4, "red", false);

        assert(GeometricObject.max(triangleLarger, triangleSmaller).equals(triangleLarger));
        assert(GeometricObject.max(circleLarger, circleSmaller).equals(circleLarger));
    }

    public static void main(final String[] args) {
        new Main();
    }

}
