package exercises.exercise_13_1.geometry;

import java.util.Arrays;

public class Triangle extends GeometricObject {

    private Triangle(final double side1, final double side2, final double side3, final String colour, final boolean filled) {
        this.sideLengths = new double[]{side1, side2, side3};
        this.colour = colour;
        this.filled = filled;
    }

    public static Triangle generateTriangle(final double side1, final double side2, final double side3, final String colour, final boolean filled) {
        if (colour == null) {
            // error logging goes here.
            return null;
        }
        if (!Triangle.validateTriangleSides(side1, side2, side3)) {
            // error logging goes here.
            return null;
        }
        return new Triangle(side1, side2, side3, colour, filled);
    }

    private static boolean validateTriangleSides(final double side1, final double side2, final double side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2;
    }

    @Override
    String getColour() {
        return this.colour;
    }

    @Override
    boolean isFilled() {
        return this.filled;
    }

    @Override
    public double getArea() {
        return (1d / 4d) * Math.sqrt((this.sideLengths[0] + (this.sideLengths[1] - this.sideLengths[2]) * (this.sideLengths[0] - this.sideLengths[1] + this.sideLengths[2]) * (-this.sideLengths[0] + this.sideLengths[1] + this.sideLengths[2]) * (this.sideLengths[0] + this.sideLengths[1] + this.sideLengths[2])));
    }

    @Override
    public double getCircumference() {
        return Arrays.stream(this.sideLengths).sum();
    }

    @Override
    public String getDescription() {
        return "A " + this.colour + " triangle with sides of length " + Arrays.toString(this.sideLengths).replaceAll("\\[|\\]", " ") + " and it is " + (this.filled ? "filled." : "not filled.");
    }
}
