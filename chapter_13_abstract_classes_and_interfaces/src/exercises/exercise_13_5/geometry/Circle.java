package exercises.exercise_13_5.geometry;

public class Circle extends GeometricObject {

    private Circle(final double perimeter, final String colour, final boolean filled) {
        this.sideLengths = new double[] { perimeter };
        this.colour = colour;
        this.filled = filled;
    }

    public static Circle generateCircle(final double perimeter, final String colour, final boolean filled) {
        if (perimeter < 0.0d || colour == null) {
            return null;
        }
        return new Circle(perimeter, colour, filled);
    }

    public static double getRadius(final Circle circle) {
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
        return Math.PI * Math.pow(Circle.getRadius(this), 2);
    }

    @Override
    public double getPerimeter() {
        return this.sideLengths[0];
    }

    @Override
    public String getDescription() {
        return null;
    }

}