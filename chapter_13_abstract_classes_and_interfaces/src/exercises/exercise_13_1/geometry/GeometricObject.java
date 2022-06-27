package exercises.exercise_13_1.geometry;

public abstract class GeometricObject {

    String colour;
    boolean filled;
    double[] sideLengths;

    abstract String getColour();

    abstract boolean isFilled();

    abstract double getArea();

    abstract double getCircumference();

    abstract String getDescription();
}