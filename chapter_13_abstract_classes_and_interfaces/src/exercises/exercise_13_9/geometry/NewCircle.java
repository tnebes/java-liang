package exercises.exercise_13_9.geometry;

import exercises.exercise_13_5.geometry.GeometricObject;

public class NewCircle extends GeometricObject implements Comparable {

    private NewCircle(final double perimeter, final String colour, final boolean filled) {
        this.sideLengths = new double[]{perimeter};
        this.colour = colour;
        this.filled = filled;
    }

    public static NewCircle generateCircle(final double perimeter, final String colour, final boolean filled) {
        if (perimeter < 0.0d || colour == null) {
            return null;
        }
        return new NewCircle(perimeter, colour, filled);
    }

    public static double getRadius(final NewCircle circle) {
        return circle.getPerimeter() / (2 * Math.PI);
    }

    @Override
    public String getColour() {
        return this.colour;
    }

    @Override
    public boolean isFilled() {
        return this.filled;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(NewCircle.getRadius(this), 2);
    }

    @Override
    public double getPerimeter() {
        return this.sideLengths[0];
    }

    @Override
    public String getDescription() {
        return null;
    }

    public boolean equals(final GeometricObject object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (object instanceof NewCircle) {
            return NewCircle.getRadius(this) == NewCircle.getRadius((NewCircle) object);
        }
        return false;
    }

}