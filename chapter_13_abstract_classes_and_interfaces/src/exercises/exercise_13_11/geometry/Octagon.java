package exercises.exercise_13_11.geometry;

import exercises.exercise_13_5.geometry.GeometricObject;

public class Octagon extends GeometricObject implements Cloneable {

    private double side;

    private Octagon(final double side, final String colour, final boolean filled) {
        this.sideLengths = new double[]{side};
        this.side = this.sideLengths[0];
        this.colour = colour;
        this.filled = filled;
    }

    private Octagon() {
        new Octagon(0, "", false);
    }

    public static Octagon getOctagon(final double side, final String colour, final boolean filled) {
        if (side < 0) {
            throw new IllegalArgumentException("Side length must be greater than 0.");
        }
        if (colour == null) {
            throw new IllegalArgumentException("Colour cannot be null.");
        }
        return new Octagon(side, colour, filled);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        if (side < 0) {
            return;
        }
        this.side = side;
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
        return (2 + 4 / Math.sqrt(2)) * this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 8;
    }

    @Override
    public String getDescription() {
        return "An Octagon with side " + this.side + " and colour " + this.colour + " and " + (this.filled ? "filled" : "not filled");
    }

    @Override
    public Octagon clone() {
        try {
            return (Octagon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}