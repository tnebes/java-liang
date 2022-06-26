package exercises.exercise_13_1;

public abstract class GeometricObject {

    String colour;
    boolean filled;
    double[] sideLengths;

    abstract String getColour();

    abstract boolean isFilled();

    abstract double getArea();

    abstract double getCircumference();
}