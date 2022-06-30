/*
 * Design an interface named Colorable
 * with a howToColor() : void method
 * Design a class called Square that extends GeometricObject and implement Colorable
 * Implement the howToColor method to display a message 'Color all four sides'
 *
 * Square must contain the data field 'side' with getters and setters
 * and constructor and no-arg constructor
 *
 * Write a test program that involves Colorable, Square, and GeometricObject. Create an array of
 * five GeometricObjects. Foreach, display the area and invoke the howToColor method if it is colorable
 */

package exercises.exercise_13_7;

import java.util.Arrays;

import exercises.exercise_13_5.geometry.Circle;
import exercises.exercise_13_5.geometry.GeometricObject;
import exercises.exercise_13_5.geometry.Triangle;
import exercises.exercise_13_7.geometry.Colorable;
import exercises.exercise_13_7.geometry.Square;

public class Main {

    private Main() {
        final GeometricObject[] geometricObjects = new GeometricObject[5];
        geometricObjects[0] = Triangle.generateTriangle(2, 3, 4, "red", true);
        geometricObjects[1] = Triangle.generateTriangle(3, 4, 5, "green", false);
        geometricObjects[2] = new Square();
        geometricObjects[3] = new Square(4);
        geometricObjects[4] = Circle.generateCircle(5, "purple", true);

        Arrays
          .stream(geometricObjects)
          .filter(geometricObject -> geometricObject instanceof Colorable)
          .map(Square.class::cast)
          .forEach(Square::howToColour);

    }

    public static void main(final String[] args) {
        new Main();
    }

}