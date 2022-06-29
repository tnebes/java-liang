package exercises.exercise_13_7.geometry;

import exercises.exercise_13_5.geometry.GeometricObject;

public class Square extends GeometricObject implements Colorable {

    public Square() {
        new Square(0.0d);
    }

    public Square(final double side) {
        this.sideLengths = new double[] { side };
    }

    public double getSide() {
        return this.sideLengths[0];
    }

    public void setSide(final double side) {
        this.sideLengths[0] = side;
    }

    @Override
    protected String getColour() {
        return this.colour;
    }

    @Override
    protected boolean isFilled() {
        return this.filled;
    }

    @Override
    protected double getArea() {
        return this.sideLengths[0] * this.sideLengths[0];
    }

    @Override
    protected double getPerimeter() {
        return this.sideLengths[0] * 4;
    }

    @Override
    protected String getDescription() {
        return "A Square of perimeter " + this.getPerimeter() + " and area " + this.getArea() + " is coloured " + this.colour + " and it is " + (this.filled ?
                                                                                                                                                   "" :
                                                                                                                                                   "not") + " filled";
    }

    public void howToColour() {
        System.out.println("Color all four sides");
    }

}
