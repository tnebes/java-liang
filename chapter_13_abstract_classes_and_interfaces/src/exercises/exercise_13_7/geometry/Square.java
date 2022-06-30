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
    public String getColour() {
        return this.colour;
    }

    @Override
    public boolean isFilled() {
        return this.filled;
    }

    @Override
    public double getArea() {
        return this.sideLengths[0] * this.sideLengths[0];
    }

    @Override
    public double getPerimeter() {
        return this.sideLengths[0] * 4;
    }

    @Override
    public String getDescription() {
        return "A Square of perimeter " + this.getPerimeter() + " and area " + this.getArea() + " is coloured " + this.colour + " and it is " + (this.filled ?
                                                                                                                                                   "" :
                                                                                                                                                   "not") + " filled";
    }

    public void howToColour() {
        System.out.println("Color all four sides");
    }

}
