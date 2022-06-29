package exercises.exercise_13_5.geometry;

public abstract class GeometricObject implements Comparable {

    String colour;
    boolean filled;
    double[] sideLengths;

    abstract String getColour();

    abstract boolean isFilled();

    abstract double getArea();

    abstract double getPerimeter();

    abstract String getDescription();

    public static GeometricObject max(final GeometricObject o1, final GeometricObject o2) {
        if (o1 != null && o2 != null) {
            return (o1).compareTo(o2) > 0 ? o1 : o2;
        }
        return null;
    }

    // this is a really bad idea as when compareTo is changed, so should the
    // equals() method be changed as some methods may utilise both compareTo() and equals().
    // essentially, weird cases can happen where a circle and a triangle with the same area are equals
    // according to the compareTo method but when using equals() they will not be equal.
    public int compareTo(final Object geometricObject) {
        if (geometricObject instanceof GeometricObject) {
            final GeometricObject temp = (GeometricObject) geometricObject;
            if (this.equals(geometricObject) || this.getArea() == temp.getArea()) {
                return 0;
            }
            return this.getArea() > temp.getArea() ? 1 : -1;
        } else {
            throw new IllegalArgumentException();
        }
    }

}